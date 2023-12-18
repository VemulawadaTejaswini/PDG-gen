import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int S = sc.nextInt();
        // スペース区切りの整数の入力
        int W = sc.nextInt();
        if (W >= S){
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }

    }
}