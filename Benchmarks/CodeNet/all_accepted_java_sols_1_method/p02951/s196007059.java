import java.util.Scanner;

public class Main{

/*
水を入れる容器が 2 つあります。
容器  には水を Aミリリットルまで入れることができ、水が Bミリリットル入っています。
容器 2 には水が C ミリリットル入っています。
容器 2から容器 1に入るだけ水を移します。
容器2の中には何ミリリットルの水が残るでしょうか。

*/
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int ans = c - (a - b);
        if (ans < 0){
            ans = 0;
        }
        System.out.println(ans);
    }
}