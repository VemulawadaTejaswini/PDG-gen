import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String s = sc.next();
        sc.close();

        s += '1';
        int cnt = 0;
        int idx = 0;
        while(idx < N){
            cnt++;
            while(s.charAt(idx) == s.charAt(idx+1)){
                idx++;
            }
            idx++;
        }
        System.out.println(cnt);
    }
}