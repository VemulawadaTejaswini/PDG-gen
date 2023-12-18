import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException{
		int[] height = new int[10];
		int i,j;
		int temp;
		for(i = 0; i < 10; i++){
			BufferedReader input = 
					new BufferedReader(new InputStreamReader(System.in));
			height[i] = Integer.parseInt(input.readLine());
		}
		
		for(i = 0; i < height.length - 1; i++){
			for(j = height.length - 1; j > i; j--){
				if(height[j] < height[j-1]){
					temp = height[j];
					height[j] = height[j-1];
					height[j-1] = temp;
				}
			}
		}
		for(i = height.length - 1; i > height.length - 4; i--){
			System.out.println(height[i]);
		}
	}
}