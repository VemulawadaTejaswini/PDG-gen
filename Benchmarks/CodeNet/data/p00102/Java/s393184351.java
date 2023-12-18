import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N <= 0)
				break;
			
			int[] sum = new int[N];

			for (int i = 0; i < N; i++) {
				String[] row = br.readLine().split(" ");
				int s = 0;
				
				for(int j=0;j<N;j++) {
					int tmp = Integer.parseInt(row[j]);
					
					sum[j] += tmp;
					s += tmp;
					
					fp(tmp);
				}
				fpln(s);
			}
			
			int s = 0;
			for (int i = 0; i < N; i++){
				fp(sum[i]);
				s += sum[i];
			}
			fpln(s);
		}
	}
	
	static String format(int i) {
		return String.format("%5d", i);
	}
	
	static void fpln(int i){
		System.out.println(format(i));
	}
	
	static void fp(int i){
		System.out.print(format(i));
	}
}