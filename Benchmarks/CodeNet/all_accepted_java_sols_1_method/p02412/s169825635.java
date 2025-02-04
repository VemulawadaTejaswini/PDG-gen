import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            
            if (n==0 && x==0) { break; }
            
            // n x   1...n -> a, b, c -> a + b + c = x
            
            int count = 0;
            for (int i=1; i<=n-2; i++) {
                for(int j=i+1; j<=n-1; j++) {
                    for(int k=j+1; k<=n; k++) {
                        if (i+j+k == x){
                            count++;
                        }
                    }
                }
            }
            
            System.out.println(count);
            
            
        }
    }
}
