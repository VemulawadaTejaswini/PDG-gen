import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int w = Integer.parseInt(br.readLine());

		for(int i=0;i<line.length();i++){
			if(i%w==0){
				System.out.print(line.charAt(i));
			}
		}
		System.out.println();
	}
}
