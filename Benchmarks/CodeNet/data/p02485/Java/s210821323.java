import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] agrs){
		String str;
		BufferedReader br;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			while((str=br.readLine())!=null){
				if(str.equals("0")) {break;}
				getSum(str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getSum(String s){
		int sum = 0;
		for(int i=0; i<s.length(); i++){
			sum += Integer.parseInt(s.substring(i,i+1));
		}
		System.out.println(sum);
	}
}