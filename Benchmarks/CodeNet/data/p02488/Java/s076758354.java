import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s;
		int sum=0;
		int n=in.nextInt();
		String ans,tmp;
		tmp=in.next();
		while (in.hasNext()) {
			s=in.next();
			if (tmp.compareTo(s)>0) {
			ans=tmp;
			}
			tmp=s;
		}
		System.out.printf("%s%n",ans);
	}
}