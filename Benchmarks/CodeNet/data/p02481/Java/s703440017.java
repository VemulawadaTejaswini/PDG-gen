import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int a,b,nagasa,mennseki;
		a=sc.nextInt();
		b=sc1.nextInt();
		mennseki=a*b;
		nagasa=a*2+b*2;
		System.out.println(mennseki+" "+nagasa);
	}
}