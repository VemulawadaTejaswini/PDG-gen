import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char before = ' ';
        int cnt = 0;
        for (int i = 0; i < N; i++){
            if (before == S.charAt(i)){
                continue;
            }
            cnt++;
            before = S.charAt(i);
        }
        System.out.println(cnt);
    }
}