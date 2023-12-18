import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return false; 
            }
        }
        return true; 
    }
	
	public static void main(String[] args) throws Exception{
			  
		  try {
		        Scanner input = new Scanner(System.in);
		        
		        while (input.hasNext()) {
		            int number = input.nextInt();
		            int count = 0;
		            for(int y = 2; y <= number;  y++) {
		            if(isPrime(y)){
				         count++; 
				        } 
		            }
		            System.out.println(count);                   
		           } 
		        	        
		        input.close();

		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		}