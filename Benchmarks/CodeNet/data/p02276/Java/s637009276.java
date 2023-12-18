import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] t = br.readLine().split(" ");
		int[] a = new int[n];
		for(int i = 0; i < n; ++i){
			a[i] = Integer.parseInt(t[i]);
		}
		int s = Partition(a, 0, n - 1);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; ++i) {
			if(i != 0){
				sb.append(" ");
			}
			if(i == s){
				sb.append('[');
				sb.append(a[i]);
				sb.append(']');
			}else{
				sb.append(a[i]);
			}
		}
		System.out.println(sb);
		
	}
	public static int Partition(int[] a, int p, int r){
		 int x = a[r];
		 int i = p - 1;
		 int tmp;
		 for(int j = p; j < r; ++j) {
			 if(a[j] <= x){
				 i += 1;
				 tmp = a[i];
				 a[i] = a[j];
				 a[j] = tmp;
			 }
		 }
		 tmp = a[i + 1];
		 a[i + 1] = a[r];
		 a[r] = tmp;
		 return i + 1;
	}
}