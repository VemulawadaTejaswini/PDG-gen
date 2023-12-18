import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		int i;
		int[] in = new int[5];
		
		for(i=0; i<in.length; i++){
			in[i] = Integer.valueOf(r.readLine());
		}
		
		// START //
		for(i=0; in[1]>0 || in[2]>0; in[1]-=in[3], in[2]-=in[4], i++);
		System.out.println(in[0] - i);
		// E N D //
	}
}