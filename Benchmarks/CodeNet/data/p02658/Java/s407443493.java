import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long pr = 1;
		long num = (long)1e18;
		int flag=0;
		while(n--!=0) {
			long c = s.nextLong();
			//System.out.println(pr);
			//System.out.println(c);
			if(c==0) {
				flag=1;
			}
			else if(pr!=-1 && pr*c>=0 && pr*c<=num) {
				pr*=c;
			}
			else {
				pr = -1;
			}
		}
		if(flag==1)
			System.out.println(0);
		else
			System.out.println(pr);
	}

}
