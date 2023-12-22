import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 空白入力
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        // 空白入力
        int ans=0;
        while(n > 0){
            ans++;
            n = n - (d * 2 + 1);
        }
        System.out.println(ans);
    }
}
