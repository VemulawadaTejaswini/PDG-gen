import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Long N, A, B;
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        A = sc.nextLong();
        B = sc.nextLong();
        Long N2 = N%(A+B);
        Long N1 = N/(A+B);
        System.out.println(A*N1 + (N2 >= A ? A : N2) );
    }
}
