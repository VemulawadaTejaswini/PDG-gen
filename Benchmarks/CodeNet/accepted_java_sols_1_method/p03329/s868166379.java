import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = n;

        for (int i=0;i<=n;i++){
            int g1 = i;
            int g2 = n-i;
            int check = 0;
            int a1 = 0;
            int a2 = 0;
            while (g1 > 0){
                int remain = g1%6;
                g1 -= remain;
                a1 += remain;
                g1 = (int) g1/6;
            }

            while (g2 > 0){
                int remain = g2%9;
                g2 -= remain;
                a2 += remain;
                g2 = (int) g2/9;
            }
            check = a1+a2;
            if (check < ret){
                ret = check;
            }
        }
        System.out.println(ret);
    }
    
}