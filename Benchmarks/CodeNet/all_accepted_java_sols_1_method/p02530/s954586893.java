import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int pointT = 0;
		int pointH = 0;
		
		n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++){
			String str[] = br.readLine().split(" ");	
			int x = str[0].compareToIgnoreCase(str[1]);
			
			if(x > 0){
				pointT += 3;
			}
			
			else if(x == 0){
				pointT++;
				pointH++;
			}
			else{
				pointH += 3;
			}
			
			
		}
		System.out.println(pointT + " " + pointH);
	}
}