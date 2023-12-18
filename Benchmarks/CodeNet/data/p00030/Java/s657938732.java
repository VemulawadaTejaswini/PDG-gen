import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(true){
    		int n = input.nextInt();
    		int s = input.nextInt();
    		int count = 0;
    		if(n == 0 && s == 0)break;
    		for(int i = 0 ; i <= 9 ; i++){
    			for(int j = i ; j <= 9 ; j++){
    				for(int k = j ; k <= 9 ; k++){
    					if(i != j && j != k && i != k && i+j+k == s){;
    						count++;
    					}
    				}
    			}
    		}
    		System.out.println(count);
    	}
    }
}