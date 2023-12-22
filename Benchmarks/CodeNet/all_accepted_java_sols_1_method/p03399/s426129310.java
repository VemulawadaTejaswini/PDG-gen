import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int a_norihoudai=sc.nextInt();
		int b=sc.nextInt();
		int b_norihoudai=sc.nextInt();

		int kei=Math.min(a,a_norihoudai)+Math.min(b,b_norihoudai);
		System.out.println(kei);
	}
}
