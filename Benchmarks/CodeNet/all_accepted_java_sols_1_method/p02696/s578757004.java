import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long index = Math.min(B-1,N);
        
        long result = (long) (Math.floor(A * index / B) - A * Math.floor(index / B));
        System.out.println(result);

    }
}