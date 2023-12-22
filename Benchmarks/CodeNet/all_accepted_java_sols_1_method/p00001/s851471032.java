import java.util.Scanner;
public class Main {
	public static void main(String[]a) {
		int i,m=0,n=0,p=0,x;
		Scanner s=new Scanner(System.in);
		for(i=0;i<10;i++){
			x=s.nextInt();
			if(m<x){
				p=n;
				n=m;
				m=x;
			}
			else if(n<x){
				p=n;
				n=x;
			}
			else if(p<x)
				p=x;
		}
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
	}

}