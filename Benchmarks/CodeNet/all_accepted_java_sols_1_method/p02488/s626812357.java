import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s;
		int sum=0;
		int n=in.nextInt();
		String str[]= new String[n];
		String ans;
		for (int i=0;i<n;i++) {
			str[i]=in.next();
		}
		ans=str[0];
		for(int i=0;i<n;i++){
			if(str[i].compareTo(ans)<=0){
				ans=str[i];
			}
		}
		System.out.printf("%s%n",ans);
	}
}