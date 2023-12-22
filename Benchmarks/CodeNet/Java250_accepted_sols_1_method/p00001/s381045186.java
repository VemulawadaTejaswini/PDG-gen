import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


class Main {
	public static void main(String[] args){
		Integer[] input = new Integer[10];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<10; i++){
			try {
				input[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		Arrays.sort(input, Collections.reverseOrder());
		
		for(int i=0; i<3; i++){
			System.out.println(input[i]);
		}
	}
}