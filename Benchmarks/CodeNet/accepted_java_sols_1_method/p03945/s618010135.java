import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        char scope = S.charAt(0);
        for(int i = 1; i < S.length(); i++){
            if(scope != S.charAt(i)){
                count++;
                scope = S.charAt(i);
            }
        }
        System.out.print(count);
    }
}