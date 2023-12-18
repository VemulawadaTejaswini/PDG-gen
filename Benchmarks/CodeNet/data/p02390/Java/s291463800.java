import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		int h;
		int m;
		int s;
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int inputValue = Integer.parseInt(br.readLine());

		if(inputValue >= 3600){
			h = inputValue/3600;
			inputValue = inputValue - (h * 3600);
		}else{
			h = 0;
		}

		if(inputValue >= 60){
			m = inputValue/60;
			s = inputValue - (m * 60);
		}else{
			m = 0;
			s = inputValue;
		}

		System.out.println(h + ":" + m + ":" + s);
	}

}