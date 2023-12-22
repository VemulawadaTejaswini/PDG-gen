import java.util.Scanner;

public class Main {
	
	public static int check(int a,int b,int c){
		int data;
		
		if(a>=b)data=a;
		else data=b;
		if(data>=c){}
		else data=c;
		
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		int B=s.nextInt();
		int C=s.nextInt();
		int K=s.nextInt();
		int d;
		int all=0;
		
		d=Main.check(A,B,C);
		if(d==A)all=B+C;
		if(d==B)all=A+C;
		if(d==C)all=B+A;
		for(int i=0;i<K;i++){
			d*=2;
		}
		System.out.print(all+d);

	}

}
