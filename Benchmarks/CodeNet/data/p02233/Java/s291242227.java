import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static long[] fibTable = new long[45];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		 // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        fibTable[0] = 1;
        fibTable[1] = 1;
        for(int i = 2; i <= 44 ; i++){
        	fibTable[i] = fibTable[i - 1] + fibTable[i - 2];
        }
        
        System.out.println(fibTable[n]);
	}
	
	static int fibonacci (int n){
		if(n == 0){
			return 1;
		}
		else if(n == 1){
			return 1;
		}
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}