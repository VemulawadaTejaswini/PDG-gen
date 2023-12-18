import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int amari = 0;
        String ans = "";
        long kari = 0;
        //System.out.println(N);
        List<String> list = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
        while(0 < N){
            kari = N % 26;
            if(kari == 0){
                kari = 26;
                N -= 1;
            }
            N /= 26;
            //System.out.println(kari);
           amari = (int)kari;
           ans += list.get(amari - 1);
        }
        StringBuffer sb = new StringBuffer(ans);
		String dst = sb.reverse().toString();
        System.out.println(dst);
    }
}
