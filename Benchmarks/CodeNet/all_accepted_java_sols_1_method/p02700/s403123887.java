
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        //通常ループ
        while(true){
            c -= b;
            if(c <= 0){
                break;
            }
            a -= d;
            if(a <= 0){
                break;
            }
        }


        if(a > c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}