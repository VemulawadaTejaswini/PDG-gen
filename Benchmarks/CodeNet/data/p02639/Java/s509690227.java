import java.util.*;

public class Mail{
	public static void main(String args[]){
    	Scanner sc = new Scannar(System.in);
      
      	for( int i = 0; i < 5; i++){
        	int a = sc.nextInt();
          
          	if(a == 0)
              System.out.print(i + 1);
        }
    }
}