import java.util.*;
import java.util.stream.Collectors;
 
 
public class Main {
    public static void main(String[] args) {
    	
        Scanner scanner=new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int ans = (a+Math.abs(b))<(a*b)?(a*b):(a+Math.abs(b));
        	
        
        System.out.println(ans);
 
 
    }
 
}
