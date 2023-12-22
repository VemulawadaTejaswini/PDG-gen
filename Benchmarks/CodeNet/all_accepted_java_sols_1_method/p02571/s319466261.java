import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int unmatch = 0;
        int unmatch_min = 1000;
        int cyc_max=s.length-t.length;
        for (int i=0; i<=cyc_max; i++){
            unmatch=0;
            for (int j=0; j<t.length; j++){
                if (!(s[i+j]==t[j])) unmatch++;
              	if (unmatch>=unmatch_min) break;
            }
            if (unmatch<unmatch_min) unmatch_min=unmatch;
        }

        System.out.println(unmatch_min);
    }
}