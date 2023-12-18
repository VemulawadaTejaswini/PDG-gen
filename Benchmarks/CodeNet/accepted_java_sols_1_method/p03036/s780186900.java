import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int x_2000 = Integer.parseInt(sc.next());
        sc.close();

        int ans = x_2000;
        for (int i = 1 ;i <= 10 ;i++ ) {
            ans = r * ans - D;
            System.out.println(ans);
        }
    }
}
