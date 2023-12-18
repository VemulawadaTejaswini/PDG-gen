import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.nextLine();
			for(int i = 0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(64<ch&&ch<91) {
					System.out.print((char)(ch+32));
				}
				else if(96<ch&&ch<123) {
					System.out.print((char)(ch-32));
				}
				else {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}
