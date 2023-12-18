import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				int M=sc.nextInt();
				if(N+M==0) break;
				int[] p=new int[N+1];
				for(int i=0; i<N; i++) {
					p[i]=sc.nextInt();
				}
				
				Arrays.sort(p);
//				for(int i=N; i>0; i--) {
//				System.out.println(p[i]);
//				}
				int ans=0;
				for(int num=0; num<4; num++) {
					for(int i=N; i>0; i--) {
						if(M>=p[i]) {
							ans+=p[i];
							//System.out.println(ans);
							M-=p[i];
							//System.out.println(M);
							break;
						}
					}
				}
				System.out.println(ans);
			}


		}
		
	}
}

