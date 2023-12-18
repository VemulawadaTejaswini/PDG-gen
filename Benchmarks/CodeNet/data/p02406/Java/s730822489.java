
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuffer str = new StringBuffer();

		for(int i=1; i<=num; i++){
			if((i % 3)==0){
				str.append(" ").append(Integer.toString(i));
				continue;
			}
			if(i%10==3){
				str.append(" ").append(i);
			}
		}

		System.out.println(str);
	}
}