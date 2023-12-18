import java.util.Scanner;
class Main{
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	double ans=0;
	for(int i=0;i<a;i++) {
		double b=scan.nextDouble();
		String str=scan.next();
		if(str.charAt(0)=='J') {
			ans+=b;
		}
		else {
			ans+=b*380000;
		}
	}
	System.out.println(ans);
	}
}