import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	static BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		Main byakko = new Main();
		
		int n,count;;
		
		while((n = Integer.parseInt(reader.readLine())) != 0){
		count = 0;
		
		while(n != 1){
			n = byakko.number(n);
			count++;
		}
		System.out.println(count);
		}
		reader.close();
	}
	
	public int number(int n){
		if(n % 2 == 0){
			n /= 2;
		}
		else{
			n = n * 3 + 1;
		}
		return n;
	}
	
}