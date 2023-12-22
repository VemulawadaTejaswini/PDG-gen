import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int S, W;
        Scanner sc = new Scanner(System.in);
        S = sc.nextInt();
        W = sc.nextInt();
        int check = S > W ? 1 : 0;
        switch (check)
        {
            case 1:
                System.out.println("safe");
                break;
            case 0:
                System.out.println("unsafe");
        }
    }
}
