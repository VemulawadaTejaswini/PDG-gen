import java.io.*;


public class Main {  
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();
		String line = br.readLine();
		int[] num = m.splitIntChange(line);
		
		if(num[0] > num[1]){
			System.out.println("a < b");
		}
		else if(num[0] < num[1]){
			System.out.println("a > b");
		}
		else if(num[0] == num[1]){
			System.out.println("a == b");
		}
		
		
	}
}