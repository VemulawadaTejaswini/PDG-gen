
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while((line = br.readLine())!= null){
			int n = Integer.parseInt(line);
			int count = 0;
			for(int a = 0;a < 10;a++){
				for(int b = 0;b < 10;b++){
					for(int c = 0;c < 10;c++){
						for(int d = 0;d < 10;d++){
							if(a+b+c+d == n){
								count++;
							}
						}	
					}	
				}	
			}
			System.out.println(count);
		}
	}

}