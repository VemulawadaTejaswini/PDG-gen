import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for(;;) {
				String str = sc.nextLine();
				if(str.contentEquals("0")) break;
				int sum = 0;
				for(int i = 0;i<str.length();i++) {
					sum += str.charAt(i)-48;
				}
				System.out.println(sum);
			}
		}
	}
}
