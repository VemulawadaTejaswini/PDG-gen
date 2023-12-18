import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a + b;
			String d = String.valueOf(c);
			int len = d.length();
			System.out.println(len);
		}
	}
} 