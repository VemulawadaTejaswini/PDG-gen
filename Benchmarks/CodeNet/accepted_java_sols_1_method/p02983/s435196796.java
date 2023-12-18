import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        final int YEAR = 2019;
        
        if(L <= YEAR && R >= YEAR) {
            System.out.println(0);
        } else {
            long min = YEAR;
            for (int i = L; i < R; i++) {
                for (int j = i+1; j <= R; j++) {
                    long ijmod = ((long)i*j)%YEAR;
                    min = Math.min(min, ijmod);
                    if(ijmod == 0) {
                        i=R;
                        j = R;
                    }
                }
            }
            System.out.println(min);
        }

    }
}
