import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Double n = scanner.nextDouble();
	
   	Double x = Math.ceil(n / 1.08);
    
    if((n)==Math.floor(x*1.08)){
    	System.out.println(x.intValue());
    }else{
      	System.out.println(":(");
    }
    
    scanner.close();

  }

}