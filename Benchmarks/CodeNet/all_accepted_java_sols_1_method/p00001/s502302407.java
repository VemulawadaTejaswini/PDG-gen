import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int[] height = new int[10];
			for (int i = 0; i < 10; i++) {
					try {
						
						height[i] = Integer.parseInt(reader.readLine());
					} catch (IOException e) {
						// TODO ????????????????????? catch ????????????
						e.printStackTrace();
					}
			}
			Arrays.sort(height);
			
			for(int i=9;i>6;i--){
				System.out.println(height[i]);
			}
		}
}