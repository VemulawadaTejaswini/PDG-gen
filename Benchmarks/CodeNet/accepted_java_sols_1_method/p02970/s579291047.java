import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int res = n/(d*2+1);
        if (n%(d*2+1)!=0) {
            res++;
        }
        System.out.println(res);
    }
}
