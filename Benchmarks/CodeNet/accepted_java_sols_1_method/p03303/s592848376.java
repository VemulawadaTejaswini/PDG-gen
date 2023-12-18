import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        int Y = sc.nextInt();
        int T = 0;
        String STR = "";

        char[] c = X.toCharArray();

        for(char c1 : c) {
            T++;
            if(T == 1){
                STR = STR + c1;
            }
            if(T == Y){
                T = 0;
            }
        }

        System.out.println(STR);
    }
}