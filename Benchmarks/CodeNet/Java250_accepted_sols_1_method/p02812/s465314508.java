import java.util.*;

//atcoderはScannerクラスのsc.next()で行ける
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.next();
        String ABC = "ABC";
        int cnt = 0;
        // abcabcabc
        for (int i = 0; i < n-2 ; i++){
            if(S.substring(i,i+3).equals(ABC)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}