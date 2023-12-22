import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int numOfInput = stdIn.nextInt();
        
        long sum = 0L;
        int max = -1000000;
        int min = 1000000;
        for(int i = 0; i < numOfInput; i++) {
            int n = stdIn.nextInt();
            sum += n;
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}