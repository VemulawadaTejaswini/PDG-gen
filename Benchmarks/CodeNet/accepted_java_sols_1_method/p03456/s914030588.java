import java.util.*;
import java.lang.*;

class Main {
    
    public static void main(String[] areg) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
        
        int num = 0;
        if (b < 10)
            num = a * 10 + b;
        if (b >= 10 && b < 100)
            num = a * 100 + b;
        if (b == 100)
            num = a * 1000 + b;
        
        double sqrt = Math.sqrt(num);
        
        System.out.println((sqrt - Math.floor(sqrt) == 0) ? "Yes" : "No");
    }
}