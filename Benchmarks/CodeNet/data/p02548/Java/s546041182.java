import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        long cnt = 0;

        for (int i=1; i<n; i++) {
            int a = i;
            int diff = n - a;
            int tmpC = (diff % a == 0) ? diff / a : diff / a + 1;
            cnt += tmpC;
//            System.out.println(tmpC);
        }

        System.out.println(cnt);


    }


}

