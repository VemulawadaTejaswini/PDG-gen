import java.util.*;
public class Main {

    public static void main(String[] args) {

        //標準入力
        Scanner sc = new Scanner(System.in);

        //変数
        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();

       if (d <= t * s){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}