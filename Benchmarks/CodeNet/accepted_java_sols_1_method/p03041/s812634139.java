import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();
		String ans="";
		for(int i=0;i<n;i++) {
			if(i==k-1)ans+=s.substring(i,i+1).toLowerCase();
			else ans+=s.substring(i,i+1);
		}
		System.out.println(ans);
	}
}