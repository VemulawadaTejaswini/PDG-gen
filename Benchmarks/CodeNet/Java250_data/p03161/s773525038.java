import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = br.readLine().split(" ");
		int N = Integer.parseInt(line1[0]);
		int K = Integer.parseInt(line1[1]);
		int[] array = new int[N+1];
		
		line1 = br.readLine().split(" ");
		for(int i = 0; i < N ; i++) {
			array[i+1] = Integer.parseInt(line1[i]);
		}
		System.out.println(metodo(N, K, array));
	}
	
	public static int metodo(int N, int K, int[] array) {
		int[] array1 = new int[N+1];
		for(int i = 2; i <= N; i++) {
			array1[i] = array1[i-1] + Math.abs(array[i-1] - array[i]);
			for(int j = i-2; j >= i-K && j > 0; j--) {
				array1[i] = Math.min(array1[i], array1[j] + Math.abs(array[j]-array[i]));
			}
		}
		
		return array1[N];
	}
}