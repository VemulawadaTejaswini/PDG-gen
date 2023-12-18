import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i=sc.nextInt();
		sc.close();
		System.out.print(n-i+1);
	}
}