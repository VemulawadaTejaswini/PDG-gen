import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String change[];
		String ans="A";
		String str;
		while(sc.hasNext()){
			str=sc.next();
			change=str.split(",");
			if(change[0]==ans)ans=change[1];
			else if(change[1]==ans)ans=change[0];
		}
		System.out.println(ans);
	}
}  