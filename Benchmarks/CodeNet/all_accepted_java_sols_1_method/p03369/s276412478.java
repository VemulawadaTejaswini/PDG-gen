import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
	  
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int total = 700;
    
    if(N.charAt(0) == 'o'){
    	total += 100;
    }
    if(N.charAt(1) == 'o'){
    	total += 100;
    }
    if(N.charAt(2) == 'o'){
    	total += 100;
    }
    System.out.println(total);
  }
}