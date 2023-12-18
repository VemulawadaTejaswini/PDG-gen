import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int n=a-b;
		if(n>0) {
			System.out.println("a > b");
		}
		if(n<0) {
			System.out.println("a < b");
		}
		if(n==0) {
			System.out.println("a == b");
	}}

}

