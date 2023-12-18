import java.util.*;
import static java.lang.System.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = str.length();
        char ans = str.charAt(num-1);
        if(ans == 's'){
            out.println(str + "es");
        }
        else{
            out.println(str + "s");
        }
    }
}