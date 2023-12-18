import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long r = s.nextInt();
		long g = s.nextInt();
		long b = s.nextInt();
		long k = s.nextInt();
		
		int flag=0;
		for(int i=0;i<=k;i++) {
			for(int j=0;j<=k;j++) {
				for(int l=0;l<=k;l++) {
					if(i+j+l==k) {
						long r1 = r*(int)Math.pow(2, i);
						long g1 = g*(int)Math.pow(2, j);
						long b1 = b*(int)Math.pow(2, l);
						
						if(r1<g1 && g1<b1) {
							//System.out.println(r1+" "+g1+" "+b1);
							System.out.println("Yes");
							flag=1;
							break;
						}
					}
					
				}
				if(flag==1) {
					break;
				}
			}
			if(flag==1)
				break;
		}
		
		if(flag==0) {
			System.out.println("No");
		}
		
	}

}