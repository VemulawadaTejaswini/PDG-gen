import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		String[] pair = str.split("\\s+");
		int N = Integer.parseInt(pair[0]);
		int K = Integer.parseInt(pair[1]);
		
		str  = reader.readLine();
		String[] words = str.split("\\s+");
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = Integer.parseInt(words[i]);
		}
		int i  = 0;
		for(int j=K;j<N;j++){
			int last = A[i];
			int curr = A[j];
			if( curr > last){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			i++;
		}
		reader.close();
	}
}