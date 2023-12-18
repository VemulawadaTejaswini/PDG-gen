import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		int t;
		for(int i=0;i<2;i++){
			if(a>b){
				t=a;
				a=b;
				b=t;
			}
			if(b>c){
				t=b;
				b=c;
				c=t;
			}
		}
		System.out.println(a+" "+b+" "+c);
	}
}
