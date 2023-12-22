import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i =1; i<10001; i++){
			if(num != 0){
				System.out.println("Case "+ i +": " + num );
				num = Integer.parseInt(br.readLine());
			}else{
				break;
			}
		}
	}
}