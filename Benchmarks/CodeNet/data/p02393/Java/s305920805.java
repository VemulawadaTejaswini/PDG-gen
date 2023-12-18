import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c,copy;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		for(int i=0;i<3;i++){
			if(a>b){
				copy=a;
				a=b;
				b=copy;
			}
			if(b>c){
				copy=b;
				b=c;
				c=copy;
			}
		}
		System.out.println(a+" "+b+" "+c+" ");
		sc.close();
	}
}

