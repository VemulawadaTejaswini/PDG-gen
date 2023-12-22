import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = 0;

        for(int a = 1; a < n; a++){
            for(int b = 1; a * b < n; b++){
                ans++;
            }
        }

        System.out.println(ans);

    }
}
