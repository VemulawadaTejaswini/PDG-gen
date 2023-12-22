import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int l = S.length();
        String[] s = new String[l-2];
        int[] sn = new int[l-2];
        int min = 753;

        for(int i=0; i<l-2; i++){
            s[i] = S.substring(i, i+3);
            sn[i] = Integer.parseInt(s[i]);
            min = Math.min(min, Math.abs(sn[i]-753));
        }
        System.out.println(min);

    }
}