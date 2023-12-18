
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int height[] = new int[10];
		for(int i=0;i<height.length;i++){
			try {
				height[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
		}
		
		Arrays.sort(height);
		
		for(int i=0;i<3;i++){
			System.out.println(height[height.length-i-1]);
		}
		
	}
}