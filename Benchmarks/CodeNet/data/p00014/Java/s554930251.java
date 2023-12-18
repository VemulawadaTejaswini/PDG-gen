

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line="";
		while((line = br.readLine())!=null){
			int d = Integer.parseInt(line);
			int menseki = 0;
			for(int i = d; i <= 600-d;i+=d){
				menseki += i*i*d;
			}
			System.out.println(menseki);
		}

	}

}