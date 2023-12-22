import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        long sum = 0;
        for(int i = 0; i < length; i++) {
            int temp = input.nextInt();
            if(temp > max)max = temp;
            if(temp< min)min = temp;
            sum += temp;
        }
        System.out.printf("%d %d %d\n", min,max,sum);
    }
}

