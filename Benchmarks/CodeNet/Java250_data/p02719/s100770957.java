import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long N = sc.nextLong();
        Long K = sc.nextLong();
        
        Long result1=N%K;
        Long result2=Math.abs(K-result1);

        System.out.println(Math.min(result1, result2));
    }
}