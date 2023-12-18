import java.util.Scanner;
class Main{
	public static void main(String[]$){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
		System.out.println(Math.min(a*x+b*y, Math.min(c*2*Math.max(x,y),c*2*Math.min(x,y)+(x>y?a*(x-y):b*(y-x) ))));
	}
}