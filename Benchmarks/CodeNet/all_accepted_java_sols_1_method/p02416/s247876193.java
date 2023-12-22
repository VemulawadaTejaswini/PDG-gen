import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long sum = 0;

		while(true){
			sum = 0;
			String str = br.readLine();
			if(str.length() >= 1){
				if(str.equals("0")){
					break;
				}
				for(int i = 0; i < str.length(); i++){
					sum += Integer.parseInt(String.valueOf(str.charAt(i)));
				}
			}
			System.out.println(sum);
		}
	}
}