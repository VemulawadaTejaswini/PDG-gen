import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int res = 0;
        for(int i = 0;i < S.length() / 2;i++){
            if(S.charAt(i) != S.charAt(S.length() - 1 -i)){
                res++;
            }
        }
        System.out.println(res);
    }
}
