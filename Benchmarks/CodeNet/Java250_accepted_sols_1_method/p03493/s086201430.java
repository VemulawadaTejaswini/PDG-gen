import java.util.*;

public class Main{
  
  public static void main (String[] args){
  
  	Scanner scanner = new Scanner (System.in);
  
 	String number = scanner.nextLine();
    
  	int count = 0;
    
  	for (int i=0; i<3; i++){
  		char temp = number.charAt(i);
  		
      	if (temp == '1'){
          count++;
        }
    }
    System.out.println(count);
  }
}