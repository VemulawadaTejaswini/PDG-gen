import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		int syakkin = 100000;
		int week = 0;

		try {
			week = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("error");
		}
		for(int i=0;i < week ;i++){
			syakkin *= 1.05;
			if(syakkin % 1000 > 0){
				syakkin /= 1000;
				syakkin++;
				syakkin *= 1000;
			}
		}
		System.out.println(syakkin);
	}
}