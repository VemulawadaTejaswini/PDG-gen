import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			long ans = 1;
			for(int i=1; i<=n; i++){
				ans = ans*i;
			}
			System.out.println(ans);
		}
	}
}