import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
    	int number = scan.nextInt();
    
		if(number % 10 == 2 ||number % 10 == 4 ||number % 10 == 5 ||number % 10 == 7 ||number % 10 == 9){
    		System.out.println("hon");
		}else if(number % 10 == 3 ){
    		System.out.println("bon");
    	}else{
          System.out.println("pon");
        }
    
	}
}