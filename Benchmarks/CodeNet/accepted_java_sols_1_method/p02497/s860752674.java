import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		while (true){
			String s = new String();
			int m = input.nextInt();
			int f = input.nextInt();
			int r = input.nextInt();
			
			if (m == -1 && f == -1 && r == -1) break;
			
			if (m == -1 || f == -1) s = "F";
			else if (80 <= m + f) s = "A";
			else if (65 <= m + f) s = "B";
			else if (50 <= m + f) s = "C";
			else if (30 <= m + f){
				if (50 <= r) s = "C";
				else s = "D";
			}
			else s = "F";
			
			System.out.println(s);
		}
	}
}