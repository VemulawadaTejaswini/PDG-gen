import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());         
           	for(int i = 0; i < num; i++){
           		String[] in =  br.readLine().split(" ",0);
           		int[] data  = {Integer.parseInt(in[0]),Integer.parseInt(in[1]),Integer.parseInt(in[2])};
           		Arrays.sort(data);
           		if(data[2] * data[2] == data[1] * data[1] + data[0] * data[0]){
           			System.out.println("YES");
           		}else {
           			System.out.println("NO");
				}
           	}


        }catch (Exception e) {
			// TODO: handle exception
        	System.exit(0);
		}
		
	}

}