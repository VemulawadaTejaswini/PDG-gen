import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		ArrayList<String> result = new ArrayList<String>();
		Scanner insert = new Scanner(System.in);
		outside:while(true) {
			String line = insert.nextLine();
			if(line.equals(".")) {
				break outside;
			}
			int beginindex = 0;
			int endindex = 0;
			ArrayList<String> input1 = new ArrayList<String>();
			while(true) {
				endindex = line.indexOf("\"", beginindex);
				if(endindex==-1) {
					input1.add(line.substring(beginindex));
					break;
				}
				input1.add(line.substring(beginindex, endindex));
				beginindex = endindex + 1;
			}
			String line2 = insert.nextLine();
			beginindex = 0;
			endindex = 0;
			ArrayList<String> input2 = new ArrayList<String>();
			while(true) {
				endindex = line2.indexOf("\"", beginindex);
				if(endindex==-1) {
					input2.add(line2.substring(beginindex));
					break;
				}
				input2.add(line2.substring(beginindex, endindex));
				beginindex = endindex + 1;
			}
//			for(int i = 0; i < input1.size(); i ++) {
//				if((i % 2) ==0) {
//					System.out.println(input1.get(i));
//				}
//			}
//			for(int i = 0; i < input2.size(); i ++) {
//				if((i % 2) ==0) {
//					System.out.println(input2.get(i));
//				}
//			}
			if(line.equals(line2)) {
				result.add("IDENTICAL");
			}
			else {
				boolean t = true;
				if(input1.size() != input2.size()) {
					result.add("DIFFERENT");
				}
				else {
					int n = 0;
					outside2:for(int i = 0; i < input1.size(); i ++) {
						if((i % 2) ==0) {
							if(!input1.get(i).equals(input2.get(i))) {
								result.add("DIFFERENT");
								t = false;
								break outside2;
							}
						}
						else {
							if(!input1.get(i).equals(input2.get(i))) {
								n++;
								if(n > 1) {
									result.add("DIFFERENT");
									t = false;
									break outside2;
								}
							}
						}
					}
					if(t) {
						if(n==1) {
							result.add("CLOSE");
						}
						else {
							result.add("DIFFERENT");
						}
					}
				}
			}

		}
		for(int i = 0;i < (result.size());i++) {
			System.out.println(result.get(i));
		}
	}
}
