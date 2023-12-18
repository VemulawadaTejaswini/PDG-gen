import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            int m = sc.nextInt();
            int nMin = sc.nextInt();
            int nMax = sc.nextInt();

            if(m == 0 && nMin == 0 && nMax == 0){
                System.exit(0);
            }

            int n = nMin;
            int maxGap = 0;
            int  successMin = sc.nextInt();

            for (int i = 2; i <= m; i++) {
                int failMax = sc.nextInt();

                if(i >nMax+1){
                    continue;
                }

                if(i > nMin){
                    int gap = successMin - failMax;
                    if(gap >= maxGap){
                        maxGap = gap;
                        n = i-1;
                    }
                }

                successMin = failMax;

            }

            System.out.println(n);
        }

    }




}