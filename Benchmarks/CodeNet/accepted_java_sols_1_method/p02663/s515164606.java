import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        if(m1 < m2){
            ans += m2 - m1 + (h2-h1)*60 -k;
        }else{
            ans += m2 + (60-m1) + (h2-h1-1)*60 -k;
        }
        System.out.println(ans);
        sc.close();

    }

}
