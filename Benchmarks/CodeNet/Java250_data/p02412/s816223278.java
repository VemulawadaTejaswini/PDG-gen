import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//?????±????????????????´?
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			list.add(sc.nextLine());
			if(list.get(list.size() - 1).equals("0 0")) {
				break;
			}
		}
		
		//?????±???int???????????????2?¬?????????????????´???????
		int [][] data = new int[list.size() - 1][2];
		for(int i = 0; i < list.size() - 1; i++) {
			String s = list.get(i);
			String[] ary = s.split(" ");
			data[i][0] = Integer.parseInt(ary[0]);
			data[i][1] = Integer.parseInt(ary[1]);
		}
		
		//
		int answer = 0;
		for(int cntData = 0; cntData < data.length; cntData++) {
			for(int count1 = 1; count1 < data[cntData][0] - 1; count1++) {
				for(int count2 = count1 + 1; count2 < data[cntData][0] ; count2++) {
					for(int count3 = count2 + 1; count3 <= data[cntData][0]; count3++) {
						if(count1 + count2 + count3 == data[cntData][1]) {
							answer++;
						}
					}
				}
			}
			System.out.println(answer);
			answer = 0;
		}
	}

}