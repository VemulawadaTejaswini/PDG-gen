import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long clone = N;
        int count = 0;
        for (int i = 2; i < Math.sqrt(clone); i++) {
            if (N%i == 0) {
                N /= i;
                count++;
            } else {
                continue;
            }
        }
        System.out.println(N == 1 ? count : count+1);
    }
}