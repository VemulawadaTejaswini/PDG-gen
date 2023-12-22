import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextInt();
        long B = sc.nextInt();

        for(int i = 10; i < 1010; i++) {
            if((int)(i * 0.08) == A && (int)(i*0.1) == B) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");

    }

}