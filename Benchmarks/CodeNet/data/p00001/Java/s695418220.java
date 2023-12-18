import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] a){

		int[] arr = new int[]{0,0,0};
		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(null != (str = bf.readLine())){
				int tmp = Integer.parseInt(str);
				if(arr[0] < tmp){
					arr[0] = tmp;
					Arrays.sort(arr);
				}
			}
			for(int i = 1; i <= 3; i++){
				System.out.println(arr[3 - i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}