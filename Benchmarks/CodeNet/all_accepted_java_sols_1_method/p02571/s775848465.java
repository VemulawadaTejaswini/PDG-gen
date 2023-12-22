import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int max = 0;
        for (int i = 0;i < S.length()-T.length()+1 ; i++){
             int cnt = 0;
            String test = S.substring(i,i+T.length());
            for (int ind = 0; ind<T.length();ind++){
                if (test.charAt(ind)==T.charAt(ind)){
                    cnt++;
                }
            }
            if (max<cnt){
                max=cnt;
            }
        }
        System.out.println(T.length()-max);
    }
}