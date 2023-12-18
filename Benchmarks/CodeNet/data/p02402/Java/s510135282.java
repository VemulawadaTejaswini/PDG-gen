import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int max = -100000, min = 1000000, input;
            long sum = 0;

            for(int i = 0; i < n; i++) {
                input = scan.nextInt();
                if(a[i] > max) max = input;
                if(a[i] < min) min = input;
                sum += input;
            }
                System.out.println(min + " " + max + " " + sum);
    }
}