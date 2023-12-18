import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int count = Integer.parseInt(input.readLine());
		String line = input.readLine();
		String [] num = line.split(" ");
		int [] n = new int [count];

		for(int i = 0 ; i < count ; i++){
			n[i] = Integer.parseInt(num[i]);
		}

		for(int j = count ;0 < j ; j--){
			sb.append(n[j - 1]);
			if( j == 1 ) break;
			sb.append(" ");
		}

		System.out.println(sb);


	}

}