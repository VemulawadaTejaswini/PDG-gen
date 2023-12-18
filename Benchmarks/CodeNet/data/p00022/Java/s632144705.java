import java.io.*;
public class Main {


	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		while(true){
			String str = br.readLine();
			if(str.equals("0"))
				break;
			int n = Integer.parseInt(str);
			int[] arr = new int[n];
			for(int i = 0; i < n; i++){
				str = br.readLine();
				arr[i] = Integer.parseInt(str);
			}
			int max = 0;
			for(int i = 1; i < n+1; i++){
				for(int j = 0; j < n+1-i; j++){
					if(i == 1 && j == 0){
						max = sumOf(arr, j, i);
					}

					if(max < sumOf(arr, j, i)){
						max = sumOf(arr, j, i);
					}
				}
			}
			System.out.println(max);
		}
	}
	// j = ツづつアツつゥツづァツつゥ
	// i = ツ可スツ古つ堕ォツつキツつゥ
	static int sumOf(int[] arr, int j, int i){
		int sum = 0;
		for(int k = j; k < j+i ; k++){
			sum += arr[k];
		}
		return sum;
	}
}