import java.util.Scanner;
public class Main {
	
	static int triplets(int x){
	    int cnt = 0;
	    for(int i = 1; i <= (int)(1e2); i++){
	        for(int j = 1; j <= (int)(1e2); j++){
	            for(int k = 1; k <= (int)(1e2); k++){
	                if(i * i + j * j + k * k + i * j + j * k + k * i > x)break;
	                if(i * i + j * j + k * k + i * j + j * k + k * i == x)cnt++;
	            }
	        }
	    }
	    return cnt;
	}
	 
	 

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		 
		    for(int i = 1; i <= n; i++){
		        System.out.println(triplets(i));
		 
		    }
		 
		 
		
	}

}
