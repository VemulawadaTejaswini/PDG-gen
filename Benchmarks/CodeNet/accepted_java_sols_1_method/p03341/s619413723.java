import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int[] imos = new int[N];
		for(int i=0;i<N;++i) imos[i] = 0;
		for(int i=0;i<N;++i){
			char muki = S.charAt(i);
			if(muki=='E'&&i!=(N-1)){
				imos[i+1]++;
			}else if(muki=='W'&&i!=0){
				imos[0]++;
				imos[i]--;
			}
		}
		
		int ans = imos[0];
		//System.out.print(imos[0]+" ");
		for(int i=1;i<N;++i){
			imos[i] += imos[i-1];
			if(imos[i]>ans) ans = imos[i];
			//System.out.print(imos[i]+" ");
		}
		//System.out.println();
		System.out.println(N-1-ans);
		return;
	}
}