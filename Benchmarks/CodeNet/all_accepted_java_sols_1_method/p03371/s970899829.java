import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
		long res1=a*x+b*y,res2=Math.max(x, y)*c*2,res3=Long.MAX_VALUE;
		if(x>y) {
			res3=y*c*2+(x-y)*a;
		}else if(x<y) {
			res3=x*c*2+(y-x)*b;
		}
		System.out.println((long)Math.min(res1, Math.min(res2, res3)));
	}
}

