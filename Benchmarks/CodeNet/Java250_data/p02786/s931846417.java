import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		long h = sc.nextLong();
		
		int k = 0;
		while(h>0) {
			k++;
			h = h/2;
		}
		
		long time = 0, c = 1;
		for(int i=1;i<=k;i++) {
			time+=c;
			c*=2;
		}
		
		System.out.println(time);
	}
}