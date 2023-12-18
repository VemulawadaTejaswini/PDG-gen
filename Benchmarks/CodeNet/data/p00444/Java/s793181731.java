import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	static Main byakko = new Main();
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args)throws IOException{
		
		int n,count;
		
		while(true){
			n = byakko.Input();
			
			if(n == 0)break;
			
			count = 0;
			
			n = 1000 - n;
			while(n >= 500){
				n = n - 500;
				count++;
			}
			while(n >= 100){
				n = n - 100;
				count++;
			}
			while(n >= 50){
				n = n - 50;
				count++;
			}
			while(n >= 10){
				n = n - 10;
				count++;
			}
			while(n >= 5){
				n = n - 5;
				count++;
			}
			while(n >= 1){
				n = n - 1;
				count++;
			}
			System.out.println(count);
		}
		reader.readLine();
	}
	
	public int Input()throws IOException{
		return Integer.parseInt(reader.readLine());
	}
	
}