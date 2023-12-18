 
import java.io.*; 
import java.util.*; 
 
public class Main
{ 
    public static void main(String args[]) 
    { 
      
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int add = A + B;
		int subtract = A-B;
		int multiply = A*B;
		
		
		if(add >= subtract && add >= multiply){
			
			System.out.println(add);
			
		} else if(subtract >= add && subtract >= multiply){

			System.out.println(subtract);

		}else {

			System.out.println(multiply);

		}			


	  
    } 
} 
