import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long rem = x % 11;
        long ans = x / 11 * 2;
        if(rem == 0){
            System.out.println(ans);
        }else{
            System.out.println(rem > 6 ? ans+2 : ans+1);
        }
    }
}
