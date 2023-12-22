import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b,c,x;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a>b){
			x=a;
			a=b;
			b=x;
		}
		if(b>c){
			x=b;
			b=c;
			c=x;
		}
		if(a>b){
			x=a;
			a=b;
			b=x;
		}
		System.out.println(a+" "+b+" "+c);
		
	}

}