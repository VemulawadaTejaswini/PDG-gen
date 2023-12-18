import java.util.Scanner;
import java.lang.StringBuffer;

class Main{
    public static long fact(int n){
        long ret = 1;
        for(int i = n; i >= 1; i--){
            ret *= i; 
        }
        return ret;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = new String(in.next());
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a'] ++;
        }
        int nOdd = 0;
        long div = 1;
        for(int i = 0; i < 26; i++){
            if(count[i] % 2 == 1){
                nOdd++;
            }
            div *= fact(count[i] / 2);
        }
        if(nOdd != s.length() % 2){
            System.out.println(0);
        }else{
            System.out.println(fact(s.length() / 2) / div);
        }
    }
}