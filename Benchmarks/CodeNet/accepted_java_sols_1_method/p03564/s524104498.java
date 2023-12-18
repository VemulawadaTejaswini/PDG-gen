import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int incremental = sc.nextInt();

        int sum = 1;

        for (int i = 0; i < num; i++) {
            if ( sum * 2 < sum + incremental) {
                sum *= 2;
            }else {
                sum += incremental;
            }
        }

        System.out.println(sum);

    }
}