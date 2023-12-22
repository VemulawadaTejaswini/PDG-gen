import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int x=cin.nextInt(),y=cin.nextInt();
		int m=x,n=y,k=x*y;
		
		while(k!=0) {
			 k=m%n;
			 m=n;n=k;
		}
		System.out.println(m);
	}

}

