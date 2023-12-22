import java.util.*;

public class Main {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
    
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        
        if (num % 2 == 0) {
        	 System.out.println(num);
        } else {
          	 System.out.println(num * 2);
        }
    }
}
