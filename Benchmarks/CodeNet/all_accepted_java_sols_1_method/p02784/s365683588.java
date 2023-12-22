import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String info = br.readLine();
		String[] split = info.split(" ");
		int H = Integer.parseInt(split[0]);
		int N = Integer.parseInt(split[1]);
		info = br.readLine();
		String[] A = info.split(" ");
		
		for(int i=0; i<N; i++) {
			
			H = H-Integer.parseInt(A[i]);
		}
		
		if(H<=0) {
			System.out.println("Yes");
		}else
			System.out.println("No");
	}
}
