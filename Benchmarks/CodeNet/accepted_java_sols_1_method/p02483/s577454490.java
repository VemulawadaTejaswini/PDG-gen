import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		int tmp;
		if(a>b){
			tmp=a;
			a=b;
			b=tmp;
		}
		if(b>c){
			tmp=b;
			b=c;
			c=tmp;
		}
		if(a>b){
			tmp=a;
			a=b;
			b=tmp;
		}
		System.out.println(a+" "+b+" "+c);
	}
}