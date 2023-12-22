import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int Amin = (A * 25 + 1) / 2;
        int Amax = ((A + 1) * 25 + 1) / 2 - 1;
        int Bmin = (B * 10);
        int Bmax = ((B + 1) * 10) - 1;

        if (Amin <= Bmin && Bmin <= Amax) {
            System.out.println(Bmin);
        } else if (Bmin <= Amin && Amin <= Bmax) {
            System.out.println(Amin);
        } else {
            System.out.println(-1);
        }
    }
}
