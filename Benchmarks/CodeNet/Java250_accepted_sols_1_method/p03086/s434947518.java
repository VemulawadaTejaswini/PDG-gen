import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans=0;
		int now=0;
		for(int i=0; i<str.length(); i++) {
			boolean isATCG=false;
			if(str.substring(i,i+1).matches("[A,T,C,G]")) {
				isATCG=true;
			}
			if(!isATCG) {
				now=0;
			}else {
				now++;
				ans=Math.max(ans,now);
			}
		}
		System.out.println(ans);
	}
}