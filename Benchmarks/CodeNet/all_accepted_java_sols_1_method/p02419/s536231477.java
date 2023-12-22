import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String W = input.next();
        int ans = 0;
        while (true){
            String T = input.next();
            if (T.equals("END_OF_TEXT")){
                break;
            }
            T = T.toLowerCase();
            if (T.equals(W)){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
