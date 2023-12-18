import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ret = 0, n = sc.nextInt();
        for(int i=0;i<n;i++){
            int l = sc.nextInt(), r = sc.nextInt();
            ret += (r - l + 1);
        }
        System.out.println(ret);
    }
}

