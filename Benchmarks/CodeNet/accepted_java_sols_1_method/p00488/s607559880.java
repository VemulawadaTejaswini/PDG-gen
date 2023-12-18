import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a<b)b=a;
			int c = sc.nextInt();
			if(b<c)c=b;
			int d = sc.nextInt();
			int e = sc.nextInt();
			if(d<e)e=d;
			System.out.println(c+e-50);
		}
		
	}	
}