import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] str = new char[S.length()];
        for (int i = 0; i < S.length();i++){
            str[i] = S.charAt(i);
        }
        for (int i = 0; i < S.length();i++){
            if (i%2 ==0){
                if (str[i] =='L'){
                    System.out.println("No");
                    return;
                }
            }
            if (i%2 ==1){
                if (str[i] == 'R'){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}