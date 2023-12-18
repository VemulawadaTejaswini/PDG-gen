import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] tmp = br.readLine().split(" ");
		for(int i = 0;i < n;i++){
			arr[i] = Integer.parseInt(tmp[i]);
		}
		tmp = null;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < n - 1;){
			sb.append(arr[n - ++i]);
			sb.append(" ");
		}
		sb.append(arr[0]);
		System.out.println(sb.toString());
		sb = null;
	}

}