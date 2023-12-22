import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int N = Integer.parseInt(a + "" + b);
        
        double d = Math.sqrt(N);
        
        
        
        System.out.println(d % 1 == 0 ? "Yes" : "No");
    }
    
}