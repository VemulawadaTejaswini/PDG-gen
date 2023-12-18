import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int x=sc.nextInt();
	double ans=0;
	int max=a*a*b;
	double high=0;
	if(x<=max/2) {
		high=((2*(double)x)/(a*b))/b;
		ans=90-Math.toDegrees(Math.atan(high));
	}else {
		x=max-x;
		high=(a/((2*(double)x)/(a*a)));
		ans=90-Math.toDegrees(Math.atan(high));
	}


	System.out.println(ans);
}
}
