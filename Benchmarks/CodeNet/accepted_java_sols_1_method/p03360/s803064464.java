import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt(),c=stdIn.nextInt(),k=stdIn.nextInt(),i,t=a,s;
		for(i=0;i<k;i++) t*=2;
		s=t+b+c;
		t=b;
		for(i=0;i<k;i++) t*=2;
		if(s<t+a+c) s=t+a+c;
		t=c;
		for(i=0;i<k;i++) t*=2;
		if(s<t+a+b) s=t+a+b;
		System.out.print(s);
	}
}