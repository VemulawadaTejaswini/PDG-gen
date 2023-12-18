import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();

        for(int i=1; i<=10; i++){
            int ans = r * x - D;
            if(ans<0) ans = 0;
            System.out.println(ans);
            x = ans;
        }
    }
}