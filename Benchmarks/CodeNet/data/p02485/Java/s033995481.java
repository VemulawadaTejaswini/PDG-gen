import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		String[] strArray;
		int sum=0;
		int array[] = {};

		try {
			while((str=br.readLine())!=null){
				if(str.equals("0"))
					break;

				SumCal(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void SumCal(String s){
		int sum=0;

		for(int i=0; i<s.length(); i++){
			sum += Integer.parseInt(s.substring(i, i+1));
		}
		System.out.println(sum);
	}
}