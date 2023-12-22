import java.lang.reflect.Array;
import java.util.*;
import static java.lang.Math.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int count =0;
            if(P + Q <= Q + R && P+Q<= P+R) {
                System.out.println(P + Q);
            }else if(Q+R <= P+Q && Q+R <= P+R){
                System.out.println(Q+R);
            }else{
                System.out.println(P+R);
            }
      

    }
}
