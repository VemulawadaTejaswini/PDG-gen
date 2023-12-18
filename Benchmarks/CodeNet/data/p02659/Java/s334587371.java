import java.util.*;

public class Main{
  public static void main(String[] args){
  
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
    	String[] src = line.split(" ");
    
    	int a = Integer.parseInt(src[0]);
    	double b = Double.parseDouble(src[1]);
    	
    	System.out.println((int)(a * b));
    	
  }
}