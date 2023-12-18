import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());

		String[] numStrAry =  br.readLine().split(" ");
		int[] numIntAry = new int[n];

		for(int i = 0 ; i < n ; i++) numIntAry[i] = Integer.parseInt(numStrAry[i]);

		insertSort(n,numIntAry);
	}

	public static void insertSort(int n, int[] numIntAry){

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n ; i++){
			sb.append(numIntAry[i]);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("\n");

		for(int i = 1 ; i < n ; i++){
			int j  = i - 1;
			int val = numIntAry[i];

			while(j >= 0 && val < numIntAry[j]){
				numIntAry[j+1] = numIntAry[j];
				j--;
			}
			numIntAry[j+1] = val;

			for(int x = 0 ; x < n ; x++){
				sb.append(numIntAry[x]);
				sb.append(" ");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\n");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}

}