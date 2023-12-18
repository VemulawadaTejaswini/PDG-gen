import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double Nt = Math.sqrt(N);
        int N2 = (int) Nt;
        sc.close();
        for(int n = 1; n <= N; n++){
            int count = 0;
            for (int x = 1; x <= N2; x++) {
                for (int y = 1; y <= N2; y++) {
                    for (int z = 1; z <= N2; z++) {
                        // System.out.println("x : " + x + "; y : " + y + "; z : " + z);
                        if ((Math.pow((x + y + z),2) - (x*y + y*z + z*x)) == n) {
                            count++;
                        }
                    }
                }
            }
        System.out.println(count);
        }
    }
}