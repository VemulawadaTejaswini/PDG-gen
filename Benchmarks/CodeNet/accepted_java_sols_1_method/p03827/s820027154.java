import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=0,num=0,n=sc.nextInt();
		String s=sc.next();
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='I')num++;
			else if(s.charAt(i)=='D')num--;
			ans=Math.max(ans, num);
		}
		System.out.println(ans);
		sc.close();
	}
}