import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0) return ;
			int ans=0;
			for(int i=0; i<n/4; i++){
				ans += in.nextInt();
			}
			System.out.println(ans);
		}
	}
}