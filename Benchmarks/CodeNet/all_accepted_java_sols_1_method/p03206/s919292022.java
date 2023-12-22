import java.util.*;
import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder ans = new StringBuilder("Christmas");
        for(int i = 25; i > n; --i){
            ans.append(" Eve");
        }
        System.out.println(ans);
    }
}