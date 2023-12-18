import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			int a=in.nextInt(),b=in.nextInt(),q=a%b;
			if(q==0)System.out.println(b);
			else System.out.println(q);
		}
	}

}

