
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        long sum = 0;
        for (int i=0; i<length; i++){
            int num = sc.nextInt();
            
            sum += num;
            if (max < num) { max = num; }
            if (num < min) { min = num; }
        }
        
        System.out.printf("%d %d %d\n", min, max, sum);
        
    }
}

