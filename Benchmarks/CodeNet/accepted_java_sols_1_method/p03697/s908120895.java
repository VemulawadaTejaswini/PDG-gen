import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n+m<10) {
			System.out.println(n+m);
		}
		else {
			System.out.println("error");
		}
	}
}