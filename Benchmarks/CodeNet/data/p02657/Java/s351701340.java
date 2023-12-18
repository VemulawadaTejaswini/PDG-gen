import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");

        long ans = 1;
        boolean isbreak = false;
        for(String str : arr){
            // 0
            if(str.equals("0")){
                ans = 0;
                isbreak = true;
                break;
            }

            ans = ans * Long.parseLong(str);

            // 上限
            if(ans > 1000000000000000000L){
                ans = -1;
                isbreak = true;
                break;
            }
        }

        System.out.println(ans);
    }
}