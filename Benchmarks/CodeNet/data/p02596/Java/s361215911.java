import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long k = sc.nextInt();

        long seven = 7;

        for(int i = 0; i <= k; i++){
            if(seven % k == 0){
                System.out.println(i + 1);
                return;
            }
            seven *= 10;
            seven += 7;
            seven %= k;
        }

        System.out.println(-1);
    }
}
