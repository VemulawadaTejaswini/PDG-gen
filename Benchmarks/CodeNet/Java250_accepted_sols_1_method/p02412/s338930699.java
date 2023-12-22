import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
		
		String[] input = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
        int cnt = 0;
        if(x == 0 && n == 0){
            break;
        }else{
            for(int i = 1; i <= n; i++ ){
            	
                for(int l = i + 1; l <= n; l++ ){
                	
                    for(int k = l + 1; k <= n; k++ ){
                    	//System.out.println(i+"+"+l+"+"+k);
                        if((i + l + k) == x){
                            cnt++;
                        }
                    }
                }
            }
    }//while 
        System.out.println(cnt);
		
		}
	}
	
}