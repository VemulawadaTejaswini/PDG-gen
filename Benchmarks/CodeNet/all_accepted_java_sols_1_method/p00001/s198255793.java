import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args)throws IOException{
		Integer[] height=new Integer[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		for(int i=0; i<10; i++){
			height[i]=Integer.valueOf(br.readLine());
		}

		int a=0;

		for(int j=0; j<9; j++){
			for(int k=9; k>j; k--){
				if(height[k]<height[k-1]){
					a=height[k];
					height[k]=height[k-1];
					height[k-1]=a;
				}
			}
		}

		for(int l=0; l<3; l++){
			System.out.println(height[9-l]);
		}
	}
}