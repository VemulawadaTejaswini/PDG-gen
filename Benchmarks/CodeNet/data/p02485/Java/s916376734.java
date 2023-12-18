import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			int sum = 0;
			String num = input.readLine();
			if(num.equals("0")) break;
			
			for(int i = 0 ; i < num.length(); i++){
				sum += Integer.parseInt(num.substring(i,i+1));
			}
			sb.append(sum + "\n");
		}
		
		System.out.print(sb);
	}
}