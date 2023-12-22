import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char tmp = S.charAt(0);
        int count = 1;
        
        for(int i=1; i<N; i++){
            if(tmp != S.charAt(i)){
                count++;
                tmp = S.charAt(i);
            }
        }
        
        System.out.println(count);
    }
}
