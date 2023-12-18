import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
		int o,p,q;
		
		if(a<b && b<c) {
			o=a;p=b;q=c;
		}
		else if(b<a && a<c) {
			o=b; p=a; q=c;
		}
		else {
			o=c; p=a; q=b;
		}
		
		if(p<q)System.out.printf("%d %d %d\n", o,p,q);
		else System.out.printf("%d %d %d\n", o,q,p);
	}

}

