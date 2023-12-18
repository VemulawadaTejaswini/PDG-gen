import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double D = scanner.nextInt();
        int ret = 0;
        for(int i = 0; i < N; i++) {
            double x = scanner.nextLong();
            double y = scanner.nextLong();
            if(Math.sqrt(x*x + y*y) <= D){
                ret++;
            }
        }
        System.out.println(ret);


    }
}
