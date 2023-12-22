import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        int arr[] = new int[10];
		if(args.length == 0) {
			BufferedReader br = new BufferedReader(new    InputStreamReader(System.in));
	         
	        for(int i=0;i<10;i++){
	            arr[i] = Integer.parseInt(br.readLine());
	        }
	         
	        Arrays.sort(arr);
	         
	        for(int i=9;i > 6;i--){
	            System.out.println(arr[i]);
	        }
		}
		else {
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				int height1 = Integer.parseInt(args[i]);
				int height2 = Integer.parseInt(args[j]);
				if(height1>height2) {
					String temp = args[i];
					args[i] = args[j];
					args[j] = temp;
				}
			}
			
		}
		for(int i=0;i<3;i++)
			System.out.println(args[i]);
		}
    }
}