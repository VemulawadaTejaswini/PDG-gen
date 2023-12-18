import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        int cnt = 0;

        for (int i=1; i<=m; i++){
            for (int j=22; j<=d; j++){
                int d10 = j/10;
                int d1 = j%10;
                if ((i == d10 * d1) && (d1 >= 2)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}