import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int length = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        long ans = 1;
        for(String str : arr){
            ans *= Long.parseLong(str);
            if(str.equals("0")){
                break;
            }
        }
        if(ans <= 1000000000000000000L){
            System.out.println(ans);
        }else {
            System.out.println(-1);
        }
    }
}