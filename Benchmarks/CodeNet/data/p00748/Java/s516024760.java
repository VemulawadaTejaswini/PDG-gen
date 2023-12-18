import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] dp1=new int[1000001];
	static int[] dp2=new int[1000001];
	static int[] p=new int[100000];
	static int max=0;
	
	static void n() {
		for(int num=1; num*(num+1)*(num+2)/6<1000000; num++) {
			dp1[num*(num+1)*(num+2)/6]=1;
			if((num*(num+1)*(num+2)/6)%2!=0){
				dp2[num*(num+1)*(num+2)/6]=1;
			}
			p[num]=num*(num+1)*(num+2)/6;
			max=num;
		}
	}

	static void dp() {
		for(int num=1; num<=1000000; num++) {
			for(int i=1; i<=max; i++) {
				if(num>p[i]) {
					dp1[num]=Math.min(dp1[num], dp1[num-p[i]]+1);
					//System.out.println("i="+i+"dp1["+num+"]="+dp1[num]);
					if(p[i]%2!=0)
					dp2[num]=Math.min(dp2[num], dp2[num-p[i]]+1);
					//System.out.println("i="+i+"dp2["+num+"]="+dp2[num]);
				}
			}
		}
	}

	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			Arrays.fill(dp1, 100000000);
			Arrays.fill(dp2, 100000000);
			n();
			dp();
			while(sc.hasNext()) {
				int N=sc.nextInt();
				if(N==0) break;
				
				System.out.println(dp1[N]+" "+dp2[N]);
				
			}
		}
	}
} 
