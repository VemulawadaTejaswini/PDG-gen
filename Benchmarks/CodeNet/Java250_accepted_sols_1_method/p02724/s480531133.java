import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int ans = 0;

        while(x >= 5){
            if(x >= 500){
                x -= 500;
                ans += 1000;
            }else{
                x -= 5;
                ans += 5;
            }
        }

        System.out.println(ans);
    }
}
