import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        
        int end = in.nextInt();
        for(int i = 0; i < end; i++) {
            int num = in.nextInt();
            min = min > num ? num : min;
            max = max < num ? num : max;
            sum += num;
        }
  
        System.out.printf("%d %d %d%n", min, max, sum);
    }
}

