import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long n=N;
        long max=(long)Math.pow(10, 15)+1;
        String res="";
        
        
        while(N>0){
            N--;
            res = res + (char)('a' + N%26);
            N = N/26;
        }
        StringBuffer ans = new StringBuffer(res);
        String hoge2 = ans.reverse().toString();
        System.out.println(ans);
    }

}