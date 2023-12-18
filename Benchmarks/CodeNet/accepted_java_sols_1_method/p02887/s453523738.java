import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char keep = '0';
        int result = 0;
        for(int i = 0; i < N; i++){
            if(S.charAt(i) != keep){
                keep = S.charAt(i);
                result++;
            }
        }
        System.out.println(result);
    }
}
