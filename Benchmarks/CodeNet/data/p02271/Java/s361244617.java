import java.util.Scanner;

public class Main {
    public static final int INFTY = 200000000;
    public static final int MOD   = 100000000;
    
    public static boolean check[];
    public static final int NUMBER = 2000;
    public static int FACTORS;
    public static int table[];
    
    public static void main(String[] args) {
        check = new boolean[NUMBER + 1];
        
        Scanner scanner = new Scanner(System.in);
        FACTORS = scanner.nextInt();
        
        table = new int[FACTORS];
        
        for(int k = 0; k < FACTORS; k++) {
            table[k] = scanner.nextInt();
        }
        
        recursive(0, 0);
        
        int queryNumber = scanner.nextInt();
        
        int tmpNum = 0;
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < queryNumber; i++) {
            tmpNum = scanner.nextInt();
            
            if(check[tmpNum]) {
                answer.append("yes\n");
            } else {
                answer.append("no\n");
            }
        }
        
        System.out.print(answer.toString());
    }
    
    public static void recursive(int key, int sum) {
        if(key == FACTORS) {
            check[sum] = true;
            return;
        }
        
        recursive(key + 1, sum);
        
        if(sum + table[key] <= NUMBER) {
            recursive(key + 1, sum + table[key]);
        }
    }
}
