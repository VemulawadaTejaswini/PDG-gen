import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		String firstStr = br.readLine();
		String str = null;
		for(int i = 1; i < num; i++){
			if((str = br.readLine()).compareTo(firstStr) < 0){
				firstStr = str;
			}
		}
		System.out.println(firstStr);
	}
}