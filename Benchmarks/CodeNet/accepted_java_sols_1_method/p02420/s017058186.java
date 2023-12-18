import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S;
        int m;
        int h;
        int lens;
        while (true){
            S = input.next();
            if (S.equals("-")){
                break;
            }
            lens = S.length();
            m = input.nextInt();
            for (int i = 0; i < m; i++){
                h = input.nextInt();
                S = S.substring(h,lens) + S.substring(0,h);
            }
            System.out.println(S);
        }
    }
}
