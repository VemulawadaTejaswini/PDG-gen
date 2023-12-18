import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int sum = 0;
			String str = br.readLine();
				if(str.equals( "0")){
					break;
				}

				for(char c : str.toCharArray()){
					sum += Integer.parseInt("" + c);
				}
			System.out.println(sum);
		}
	}
}