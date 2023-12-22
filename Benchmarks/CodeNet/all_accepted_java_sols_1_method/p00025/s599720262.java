import java.util.*;

public class Main {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int[] a = new int[4];

            int hit = 0;
            int blow = 0;
            
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }
            
            for (int i = 0; i < a.length; i++) {
                int b = scanner.nextInt();
                for (int j = 0; j < a.length; j++) {
                    if (a[i] == b) {
                        hit++;
                        break;
                    } else if (a[j] == b) {
                        blow++;
                        break;
                    }
                }
            }
            System.out.println(hit + " " + blow);
        }
    }
}