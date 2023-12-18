import java.io.*;


public class Main {

	public static void main(String[] args) throws Exception {
		int[] height = new int[30];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<30;i++){
			int a = Integer.parseInt(in.readLine());
			height[i] = a;
		}
		int length = height.length;
		for(int i=0;i<length;i++){
			for(int j=(i+1);j<length-1;j++){
				if(height[i]<height[j]){
					int temp = height[j];
					height[j] = height[i];
					height[i] = temp;
				}
			}
		}
		
		System.out.println(" Top three heights are : ");
		for(int i=0;i<3;i++){
			System.out.println(height[i]);
		}

	}

}