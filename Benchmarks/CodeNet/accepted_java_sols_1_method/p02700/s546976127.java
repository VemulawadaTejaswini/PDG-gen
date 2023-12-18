import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        String judge = "No";

        while (true) {
            C = C - B;
            if (C <= 0) {
                judge = "Yes";
                break;
            }
          
            A = A - D;
            if (A <= 0) {
                break;
            }
        }
        System.out.println(judge);
    }

}