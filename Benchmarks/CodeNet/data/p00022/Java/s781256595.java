import java.util.Scanner;

public class Main {
	
	static int minusCnt(int[] a){
		int count = 0;
		for(int i=0; i<a.length; i++)
			if(a[i] < 0) count++;
		return count;
	}
	
	static int[] minusIdx(int[] a,int cnt){
		int[] idx = new int[cnt];
		int j=0;
		for(int i=0; i<a.length; i++)
			if(a[i] < 0) idx[j++] = i;
		return idx;
	}
	
	//最大値
	static int maxOf(int[] a){
		int max = a[0];
		for(int i:a)
			if(max < i) max = i;
		return max;		
	}
	
	//最小値
	static int minOf(int[] a){
		int min = a[0];
		for(int i:a)
			if(min > i) min = i;
		return min;		
	}
	
	//[配列]を表示して改行.
	static void aryPrint(int[] a){
		for(int i : a) System.out.print(i + " ");
		System.out.println();
	}
	
	static int LsumUp(int[] a,int idx){
		int x=0;
		for(int i=0; i<=idx; i++) x +=a[i];
		return x ;
	}
	
	static int RsumUp(int[] a,int idx){
		int y=0;
		for(int i=idx; i<a.length; i++) y +=a[i];
		return y ;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			n = stdIn.nextInt();
			if(n==0) break;
			int[] a = new int[n];
			int sum = 0;
			for(int i=0; i<n; i++){
				a[i] = stdIn.nextInt();
				sum += a[i];
			}
			int cnt = minusCnt(a);
			if(cnt==0){ System.out.println(sum); continue; }
			if(cnt==a.length || cnt == a.length-1){System.out.println(maxOf(a)); continue; }
			
			int[] minusIdx = minusIdx(a,cnt); //負の要素の番号を
			
			int[] Lbest = new int[minusIdx.length];
			int[] Rbest = new int[minusIdx.length];
			
			for(int i=0; i < minusIdx.length; i++){
				 Lbest[i] = LsumUp(a,minusIdx[i]);
				 Rbest[i] = RsumUp(a,minusIdx[i]);
			}
			int best=0;
			if(best > minOf(Lbest)) best = minOf(Lbest);
			if(best > minOf(Rbest)) best = minOf(Rbest);
			for(int i=0; i<minusIdx.length-1; i++){
				for(int j=i+1; j<minusIdx.length; j++) if(best > (Lbest[i]+Rbest[j])) best = Lbest[i]+Rbest[j];
			}
			System.out.println(sum-best);
		} while(true);
	}
}