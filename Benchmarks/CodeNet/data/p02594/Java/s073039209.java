import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 30){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }

        //何回かやったそのうち一番良い結果になった物を出力（学習させていく感じ）
        //LinkedList?をn回繰り返して最良の物を選ぶ？
    }
}
