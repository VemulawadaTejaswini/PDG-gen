import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int N = sc.nextInt();
		int[] h = new int[N+1];
		h[0] = 0;
		for(int i=1;i<N+1;i++){
			h[i] = sc.nextInt();
        }	
		for(int j=1;j<N+1;j++){
			if(h[j]-h[j-1]>=0){
				cnt += (h[j]-h[j-1]);
			}
		}
		System.out.println(cnt);
    }
}