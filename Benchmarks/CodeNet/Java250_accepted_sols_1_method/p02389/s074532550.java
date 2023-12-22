import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,ms,ns;
		a = sc.nextInt();
		b = sc.nextInt();
		ms = a*b;
		ns = 2*(a+b);
		System.out.println(ms+" "+ns);
	}
}