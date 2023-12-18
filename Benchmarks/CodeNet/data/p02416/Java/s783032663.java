//????????????????±???????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		StringBuilder sb = new StringBuilder();
		
		int sum = 0;
		
		while(true) {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			sum = 0;
			
			String str = br.readLine();	
			
			int inputNum = Integer.parseInt(str);
			
			if(inputNum == 0) {
				break;
			}
			
			for(int i=0; i<str.length(); i++) {
				int num = Integer.parseInt(String.valueOf(str.charAt(i)));
				sum = sum + num;
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb.toString());
	}

}