import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int n, x;
    	while(true){
    		int count = 0;
    		n = in.nextInt();
    		x = in.nextInt();
    		if(n == 0 && x == 0) break;
    		for(int i = 1 ; i <= n; i++){
    			for(int j = i+1 ; j <= n ; j++){
    				for(int k = j+1 ; k <= n ; k++){
    					if(i + j + k == x) count++;
    				}
    			}
    		}
    		System.out.println(count);
    	}
    }
}