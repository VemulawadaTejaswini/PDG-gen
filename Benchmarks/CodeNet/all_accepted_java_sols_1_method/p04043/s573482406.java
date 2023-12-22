import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, count5, count7;
        count5 = count7 = 0;

        for (int i = 0; i < 3; i++) {
            N = sc.nextInt();
            if (N == 5) {
                ++count5;
            }else if (N == 7){
                ++count7;
            }
        }

        if(count5 == 2 && count7 == 1) {
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }

        sc.close();
    }
}