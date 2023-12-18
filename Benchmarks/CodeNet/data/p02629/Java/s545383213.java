import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        long x = sc.nextLong();
        for(int i=1;i<30;i++){
            if(x==0)break;
            ans += (char)(96 + x % 26);
            x /= 26;}
        for(int i=ans.length()-1;i>=0;i--){
            System.out.print(ans.charAt(i));
        }
    }
}
