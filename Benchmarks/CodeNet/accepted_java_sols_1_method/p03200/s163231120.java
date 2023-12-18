import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int b = 0;
        long ans = 0;
        for(char c : s){
            if(c == 'B'){
                b++;
            }else{
                ans += b;
            }
        }
        System.out.println(ans);
    }
}