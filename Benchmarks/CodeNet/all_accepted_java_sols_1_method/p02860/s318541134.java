import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		if(n%2!=0)
			System.out.println("No");
		else {
			boolean same=true;
			
			for(int i=0;i<n/2;++i) {
				if(str.charAt(i)!=str.charAt(i+n/2)) {
					same=false;
					break;
				}
			}
			if(same)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}