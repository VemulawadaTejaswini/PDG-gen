import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		int[] height = new int[10];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<10;i++){
			int a = Integer.parseInt(in.readLine());
			height[i] = a;
		}
		int length = height.length;
		for(int i=0;i<length;i++){
			for(int j=(i+1);j<length;j++){
				if(height[i]<height[j]){
					int temp = height[j];
					height[j] = height[i];
					height[i] = temp;
				}
			}
		}
		for(int i=0;i<3;i++){
			System.out.println(height[i]);
		}

	}

}