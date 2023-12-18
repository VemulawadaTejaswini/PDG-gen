import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */

public class Main{
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String k = s.next();
		
		int ctr=0;
		for(int i=1;i<n;i++) {
			if(k.charAt(i)!=k.charAt(i-1)) {
				ctr++;
			}
		}
		System.out.println(ctr+1);
	}
}