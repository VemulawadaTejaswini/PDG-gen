import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int x;
        int y;
        int tmp;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 3000;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            if(x >= 0 && x <= 10000 && y >= 0 && y <= 10000){
                if(x == 0 && y == 0){
                   break;
                }else if(x > y){
                    tmp = x;
                    x = y;
                    y = tmp;
                }
                System.out.println(x + " " + y);
            }else{
                System.out.println("入力された数値が正しくありません。");
                continue;
            }
        }
    }
}
