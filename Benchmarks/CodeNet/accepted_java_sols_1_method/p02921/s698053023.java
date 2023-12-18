import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        char[] c = s.toCharArray();
        char[] c1 = t.toCharArray();

        int n =0;
        for (int i=0; i<3; i++){
            if (c[i]==c1[i]){
                n++;
            }
        }
        System.out.println(n);
    }
}