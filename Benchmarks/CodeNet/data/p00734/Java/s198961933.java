import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n==0&&m==0){
				return;
			}
			
			int[] nt = new int[n];
			int[] mh = new int[m];
			int st = 0, sh = 0;
			for(int i=0;i<n;i++){
				nt[i] = stdIn.nextInt();
				st += nt[i];
			}
			for(int i=0;i<m;i++){
				mh[i] = stdIn.nextInt();
				sh += mh[i];
			}
			Arrays.sort(nt);
			Arrays.sort(mh);
			int ans = -1;
			int x=0, y=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					if(st-nt[i]+mh[j]==sh-mh[j]+nt[i]){
						if(ans==-1||nt[i]+mh[j]<ans){
							ans = nt[i]+mh[j];
							x = nt[i];
							y = mh[j];
						}
					}
				}
			}
			if(ans==-1){
				System.out.println(ans);
			}
			else{
				System.out.println(x+" "+y);
			}
		}
	}
}