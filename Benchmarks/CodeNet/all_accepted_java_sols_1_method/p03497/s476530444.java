import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int k = Integer.parseInt(tmpArray[1]);
		
		int balls[] = new int[n + 1];
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			int tmp = Integer.parseInt(tmpArray[i]);
			
			balls[tmp]++;
		}
		
		Arrays.sort(balls);
		
		//debug
//		for(int i = 0; i <= n; i++){
//			System.out.print(balls[i]+" ");
//		}
//		System.out.println();
//		
		//0じゃないインデックスを探す
		int nonZero = -1;
		for(int i = 0; i <= n; i++){
			if(balls[i] != 0){
				nonZero = i;
				break;
			}
		}
		
		int kinds = n - nonZero;
		
		int sum = 0;
		
		for(int i = nonZero; i <= n - k; i++){
			sum += balls[i];
		}
		
		System.out.println(sum);
	}

}
