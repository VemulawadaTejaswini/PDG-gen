
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char a[]=s.toCharArray();
		int c=0;
		int j=1;
		for(int i=0;i<n-2;i++) {
			if(a[i]=='A'&&a[i+1]=='B'&&a[i+2]=='C')
				c++;
		}
		System.out.println(c);


	}

}
