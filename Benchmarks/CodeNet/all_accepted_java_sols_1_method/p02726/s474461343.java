import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
public class Main {
	static int N ;
	static int X ;
	static int Y ;

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");

		int N = Integer.parseInt(Ws[0]);
		 X = Integer.parseInt(Ws[1]);
		 Y = Integer.parseInt(Ws[2]);

		 ArrayDeque<Integer> q = new ArrayDeque<>();
		 long[] dist = new long[N+1];
		 long[] C = new long[N+2];
		 Arrays.fill(dist,0);

		 for(int i=1;i<=N;i++){
			 Arrays.fill(C, Long.MAX_VALUE);
			 C[0]=0;
			 C[N+1]=0;
			 C[i]=0;
			 q.add(i);
			 while(!q.isEmpty()){
				 int num = q.remove();
				 if(C[num-1]==Long.MAX_VALUE){
					 q.add(num-1);
					 C[num-1]=C[num]+1;
				 }
				 if(C[num+1]==Long.MAX_VALUE){
					 q.add(num+1);
					 C[num+1]=C[num]+1;
				 }
				 if(num == X && C[Y]==Long.MAX_VALUE){
					 q.add(Y);
					 C[Y]=C[num]+1;
				 }
				 if(num == Y && C[X]==Long.MAX_VALUE){
					 q.add(X);
					 C[X]=C[num]+1;
				 }
			 }
			 for(int x=1;x<=N;x++){
				 dist[(int)C[x]]++;
			 }
		 }
		 for(int k=1;k<N;k++){
			 System.out.println(dist[k]/2);
		 }
	}
}