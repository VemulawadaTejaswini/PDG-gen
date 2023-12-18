import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x;
        int numOfPair = 0;      
        
        while (true) {
            n = scanner.nextInt();
            x = scanner.nextInt();
            
            if (n == 0 && x == 0) {
                break;
            }
            if (n < 3 || n > 100) {
                break;
            }
            
            numOfPair = 0;
            int i, j, k;
            for (k = n; k > 2; k--) {
                for(j = k-1; j > 1; j--) {
                    for(i = j-1; i > 0; i--) {
                        if ((k+j+i) == x) {
                            numOfPair++;
                        }
                    }
                }
            }
             System.out.println(numOfPair);
        }  
    }
}