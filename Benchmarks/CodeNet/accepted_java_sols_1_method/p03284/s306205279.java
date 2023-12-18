import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),k=scan.nextInt();
		scan.close();
		System.out.print(n%k!=0?"1":"0");
	}
}