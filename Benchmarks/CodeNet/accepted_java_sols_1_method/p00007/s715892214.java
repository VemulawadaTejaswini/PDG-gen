import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int data = Integer.parseInt(br.readLine());
		
		int debt = 100000;
		for(int i=0;i<data;i++) {
			debt = (int)Math.ceil(debt*1.05/1000)*1000;
		}
		
		System.out.println(debt); 
	}
}