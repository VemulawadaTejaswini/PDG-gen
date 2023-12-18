import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\n");
		String str = "";
		String[] list;
		double[] math = new double[40];
		while(scan.hasNext()) {
			str = scan.nextLine();
			list = str.split(" ",0);
			int count = 0;
			for(String s : list) {
				if(s.equals("+")) {
					math[count-2] = math[count-2] + math[count-1];
					count--;
				}
				else if(s.equals("-")) {
					math[count-2] = math[count-2] - math[count-1];
					count--;
				}
				else if(s.equals("*")) {
					math[count-2] = math[count-2] * math[count-1];
					count--;
				}
				else if(s.equals("/")) {
					math[count-2] = math[count-2] / math[count-1];
					count--;
				}
				else {
					math[count] = Integer.parseInt(s);
					count++;
				}
				
			}
			System.out.println(math[0]);
		}

	}
}