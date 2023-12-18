import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();

        long MOD = 7L % K;
        long R = 1L;

        HashSet<Long> C = new HashSet<>();
        while(MOD != 0L){
            if (C.contains(MOD)){
                System.out.println(-1);
                return;
            }
            MOD = ((MOD * 10) % K + 7L) % K;
            C.add(MOD);
            R++;
        }

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
