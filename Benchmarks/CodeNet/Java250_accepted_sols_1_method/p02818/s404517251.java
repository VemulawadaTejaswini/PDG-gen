import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        
        long Takahashi = Math.max(0, A-K);
        long Aoki = Math.max(0, Math.min(B, B - (K - A)));
        
        System.out.println(Takahashi + " " + Aoki);
        
    }

}
