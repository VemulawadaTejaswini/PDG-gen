import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a==0)break;
            for (int i = 0; i < a; i++) {
                int pm = sc.nextInt();
                int pe = sc.nextInt();
                int pj = sc.nextInt();

                if (pm == 100 || pe == 100 || pj == 100 || (pm + pe) / 2 >= 90 || (pm + pe + pj) / 3 >= 80) {
                    System.out.println("A");
                } else if ((pm + pe + pj) / 3 >= 70 || (pm + pe + pj) / 3 >= 50 && (pm >= 80 || pe >= 80)) {
                    System.out.println("B");
                } else {
                    System.out.println("C");
                }
            }
        }
    }
}