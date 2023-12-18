import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N,min,cnt;
	static int[] a =new int[180];
	static int[] b =new int[45];
	static int[] already;
	static{
		int cnt=0;
		for(int i = 1;tetrahedral(i)<=1000000;i++){
			int t = tetrahedral(i);
			a[cnt++]=t;
		}
		for(int i = 0;i<a.length;i++){
			//System.out.println(a[i]);
		}		
		already=new int[1000001];
		cnt=0;
		for(int i = 1;tetrahedral(i)<=1000000;i++){
			int t = tetrahedral(i);
			if(t%2==1){
				b[cnt++]=t;
			}
		}

	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			N =cin.nextInt();
			if(N==0){
				break;
			}
			cnt=0;
			Arrays.fill(already, min=Integer.MAX_VALUE);
			backtracka(0,0);
			System.out.print(min);
			cnt=0;
			Arrays.fill(already, min=Integer.MAX_VALUE);
			backtrackb(0,0);
			System.out.println(" "+min);
		}

	}
	static void backtrackb(int sum,int idx){
		if(sum==N){
			min=Math.min(min, cnt);
		}
		if(already[sum]<cnt||idx==b.length||min<cnt)return;
		for(int i = 0;sum+b[idx]*i<=N;i++){
			if(min<cnt+i){
				break;
			}
			if(already[sum+b[idx]*i]<cnt+i){
				continue;
			}
			cnt+=i;
			already[sum+b[idx]*i]=cnt;
			backtrackb(sum+b[idx]*i,idx+1);
			cnt-=i;
		}
	}
	static void backtracka(int sum,int idx){
		/*if(Arrays.binarySearch(a, N-sum)>=0){
			min=Math.min(min, cnt+1);
			return;
		}*/
		if(sum==N){
			min=Math.min(min, cnt);
		}
		if(already[sum]<cnt||idx==a.length||min<cnt)return;
		for(int i = 0;sum+a[idx]*i<=N;i++){
			if(min<cnt+i){
				break;
			}
			if(already[sum+a[idx]*i]<cnt+i){
				continue;
			}
			
			cnt+=i;
			already[sum+a[idx]*i]=cnt;
			backtracka(sum+a[idx]*i,idx+1);
			cnt-=i;
		}
	}
	static int tetrahedral(int a){
		return (a*(a+1)*(a+2))/6;
	}
}