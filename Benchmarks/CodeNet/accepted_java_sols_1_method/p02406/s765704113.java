import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		int N = Integer.parseInt(line);
		int x = 0;
		int i = 0;
		for(i = 3; i <= N; i++){
			x = i;
			if(x % 3 == 0){
				System.out.print(" "+i);
			}else{
				while(x!=0){
	                if(x%10==3){
	                    System.out.print(" " + i);
	                    break ; 
	                }
	                x = x/10; 
	            }
			}
		}
		System.out.printf("\n");
	}

}