import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        int n = a.length;
        int res = 0;
        for(int i=0; i<n; i++) {
            if(a[i] != b[i]) res++;
        }

        System.out.println(res);

    }

}