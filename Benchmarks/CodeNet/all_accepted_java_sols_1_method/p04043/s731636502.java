import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int five = 0;
      	int seven = 0;
      
      	for(int i = 0; i < 3; i++) {
        	int number = scanner.nextInt();
          
          	if(number == 5) {
            	five = five + 1;
            } else if(number == 7) {
            	seven = seven + 1;
            }
        }
         
      	if(five == 2 && seven == 1) {
        	System.out.println("YES");
          	return;
        }
          
       	System.out.println("NO");  	
	}
}
 

 

