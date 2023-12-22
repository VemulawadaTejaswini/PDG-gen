import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        sc.close();

        long N = A.length();
        long[] cnt = new long[26];
        long count = N*(N-1)/2;
        for(int i = 0; i < N; i++){
            cnt[(int)(A.charAt(i)-'a')]++;
        }
        for(int i = 0; i < 26; i++){
            count -= cnt[i]*(cnt[i]-1)/2;
        }
        System.out.println(count+1);
    }
}