import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int t_hit = a;
        int a_hit = c;

        while (true) {
            a_hit = a_hit - b;
            t_hit = t_hit - d; //後
            if (a_hit <= 0) {
                System.out.println("Yes");
                break;
            }else if (t_hit <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}