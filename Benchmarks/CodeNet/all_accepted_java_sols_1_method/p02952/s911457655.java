import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans  = 0;

        for(int i = 1; i <= n ; i++){
            if(i >= 10 && i <= 99) continue;
            if(i >= 1000 && i <= 9999) continue;
            if(i == 100000) continue;

            ans++;
        }

        System.out.println(ans);
        return;
    }
}