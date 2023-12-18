import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		int num;
		String[] str;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();

		str = br.readLine().split(" ");
		num = Integer.parseInt(str[0]);

		for(int i = 1; i <= num; i++){
			if(i / 10 == 3){
				builder.append(" " + i);
			}else if(i % 3 == 0){
				builder.append(" " + i);
			}else if(i % 10 == 3){
				builder.append(" " + i);
			}
		}
		System.out.println(builder);
		br.close();
	}
}