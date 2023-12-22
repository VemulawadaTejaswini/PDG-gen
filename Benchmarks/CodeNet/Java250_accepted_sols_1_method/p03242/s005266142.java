import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int a=n/100; //百の位
		int b=n/10-a*10; //十の位
		int c=n-a*100-b*10; //一の位


		if(a==9){
			a=1;
		}else{
			a=9;
		}
		if(b==9){
			b=1;
		}else{
			b=9;
		}
		if(c==9){
			c=1;
		}else{
			c=9;
		}


		System.out.println(a+""+b+""+c);

	}
}
