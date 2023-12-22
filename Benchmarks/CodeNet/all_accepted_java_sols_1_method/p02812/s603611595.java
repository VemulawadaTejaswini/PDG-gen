import java.util.*;

public class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String a=s.next();

		int r=0;
		for(int i=0;i+3<=n;++i) {
			if(a.substring(i,i+3).equals("ABC"))
				++r;
		}
		System.out.println(r);
	}
}
