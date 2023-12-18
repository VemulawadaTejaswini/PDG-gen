import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		while (true){
			String num = input.next();
			if (num.equals("0")) break;
			
			int sum = 0;
			for (char c : num.toCharArray()){
				sum += c - '0';
			}
			
			System.out.println(sum);
		}
	}
}