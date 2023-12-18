import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        int res = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i])
                res++;
        }
        System.out.println(res);
    }
}