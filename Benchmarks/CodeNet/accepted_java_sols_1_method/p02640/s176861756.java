import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int  y = sc.nextInt();
        boolean ans = false;
        for (int i = 0; i <= x; i++) {
            int a = i * 2;
            int b = (x-i) * 4;
            if(a + b == y){
                ans = true;
                break;
            }
        }
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }

}
