import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i=1; i<=1250; i++) {
            if((int)Math.floor(i*0.08)==a && (int)Math.floor(i*0.10)==b) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
