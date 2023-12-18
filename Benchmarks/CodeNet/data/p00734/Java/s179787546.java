import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt(), m = in.nextInt();
			if(n==0 && m==0) break;
			int as[] = new int[n], bs[] = new int[m];
			for(int i=0; i<n; i++) as[i] = in.nextInt();
			for(int i=0; i<m; i++) bs[i] = in.nextInt();
			int totalA=0, totalB=0;
			int a=-1, b=-1, s=1<<29;
			for(int i=0; i<n; i++) totalA += as[i];
			for(int i=0; i<m; i++) totalB += bs[i];
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					if(as[i] + bs[j] < s && totalA - as[i] + bs[j] == totalB - bs[j] + as[i]){
						s = as[i] + bs[j];
						a = as[i];
						b = bs[j];
					}
				}
			}
			if(a<0) System.out.println(-1);
			else System.out.println(a + " " + b);
		}
	}
	
}