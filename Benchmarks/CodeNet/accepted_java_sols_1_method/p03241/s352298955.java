import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = m / n;
        for(int kouyakusu = max; kouyakusu > 0; kouyakusu--) {
            if(m % kouyakusu == 0) {
                System.out.println(kouyakusu);
                return;
            }
        }
    }
}