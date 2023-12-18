import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isLoop = true;
        if (n % 2 == 0){
            System.out.println("-1");
            isLoop = false;
        }
        if (n % 5 == 0){
            System.out.println("-1");
            isLoop = false;
        }

        int k  = 1000000;
        int mod = 0;
        boolean isAnswer = false;
        if (isLoop) {
            for (int i = 1; i < k; i++) {
                mod = (mod * 10 + 7) % n;
                if (mod == 0){
                    System.out.println(i);
                    isAnswer = true;
                    break;
                }else{
//                    System.out.println(mod);
                }

            }
        }
        if (!isAnswer) {
            System.out.println("-1");
        }
    }
}
