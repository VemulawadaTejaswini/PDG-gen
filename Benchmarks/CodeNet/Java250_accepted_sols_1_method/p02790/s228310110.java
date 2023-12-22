import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String retA = "";
        String retB = "";
        for(int i=0;i<b;i++){
            retA += String.valueOf(a);
        }
        for(int i=0;i<a;i++){
            retB += String.valueOf(b);
        }
        String ret = retA.length()>retB.length() ? retA : retB;
        System.out.println(ret);
    }
}
