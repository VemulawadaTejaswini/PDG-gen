import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s;
		int sum=0;
		int n=in.nextInt();
		String ans;
		ans=in.next();
		while (in.hasNext()) {
			s=in.next();
			if (ans.compareTo(s)<0) {
			ans=s;
			}
		}
		System.out.printf("%s%n",ans);
	}
}