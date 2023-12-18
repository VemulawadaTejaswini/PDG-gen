import java.util.*;

public class Main {
	public static int n[][] = {{1,1},{0,1},{-1,1},{1,0},{-1,0},{0,-1}};
	public static void main(String[] args) {
			Scanner scan =  new Scanner(System.in);
			int n = scan.nextInt();
			long ans = 1;
			for(int i=0;i<n;i++){
				long m = scan.nextLong();
				if(ans == -1){
					if(m==0){
						ans=0;
						break;
					}
				}else if(((long)ans*m)>1000000000000000000L && ((long)ans*m)<=0){
					ans=-1;
				}
				else{
					ans=(long)ans*m;
				}
			}
			System.out.println(ans);
	}
}
