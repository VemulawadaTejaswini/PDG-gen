import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		
		while(!s.equals("0")){
			int num = 0;
			for(int i = 0; i < s.length(); i++){
				num += Integer.parseInt(s.substring(i, i+1));
			}
			System.out.println(num);
			s = in.readLine();
		}
	}

}