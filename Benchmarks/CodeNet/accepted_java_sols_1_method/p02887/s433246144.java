import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char tmp=' ';
		int ans=n;
		for(int i=0;i<n;i++) {
			char a=s.charAt(i);
			if(a==tmp) {
				ans--;
			}
			tmp=a;
		}
		System.out.println(ans);
	}
}