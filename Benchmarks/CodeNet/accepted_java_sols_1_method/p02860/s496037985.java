
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==1) {
			System.out.println("No");
		}else {
			String s=sc.next();
		    int a=n/2;
		    int c=0;
		    for(int i=0;a<n;i++) {
		    	if(s.charAt(i)==s.charAt(a)) {
		    		c++;
		    	}a++;

		    }
		    if(c==n/2) {
		    	System.out.println("Yes");
		    }else {
		    	System.out.println("No");
		    }
		}

	}

}
