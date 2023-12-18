import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str1 = br.readLine();
			String line[] = str1.split(" ");
			
			int a= Integer.parseInt(line[0]);
			int b= Integer.parseInt(line[1]);

			if(a>b){
				System.out.println("a>b");
			}else if(a==b){
				System.out.println("a==b");
			}else if(a<b){
				System.out.println("a<b");
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}

}