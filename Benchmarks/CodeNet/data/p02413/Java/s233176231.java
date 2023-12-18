import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = parceIntArray(br.readLine().split(" "));
		int r = arr[0];
		int c = arr[1];
		int[][] sheet = new int[r + 1][c + 1];
		for(int i = 0;i < r;i++){
			arr = parceIntArray(br.readLine().split(" "));
			for(int j = 0;j < arr.length;j++){
				sheet[i][j] = arr[j];
			}
		}
		arr = null;
		for(int i = 0;i < r;i++){
			for(int j = 0;j < c;j++){
				sheet[i][c] += sheet[i][j];
			}
		}
		for(int i = 0;i < c + 1;i++){
			for(int j = 0;j < r;j++){
				sheet[r][i] +=  sheet[j][i];
			}
		}
		for(int i = 0;i < r + 1;i++){
			write(sheet[i]);
		}
	}

	static int[] parceIntArray(String[] strArr){
		int[] arr = new int[strArr.length];
		for(int i = 0;i < arr.length;i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}
		return arr;
	}
	
	static void write(int[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < arr.length;i++){
			sb.append(arr[i]);
			if(i >= arr.length - 1){
				break;
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}