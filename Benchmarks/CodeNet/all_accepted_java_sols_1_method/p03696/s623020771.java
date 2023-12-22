import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        sc.close();
        int right = 0;
        int left = 0;

        for(int i = 0; i < N; i++){
            if(S.charAt(i) == ')')
                left++;
            else
                right++;
            if(left > right) {
                System.out.print('(');
                left--;
            } else {
                if(left > 0){
                    right--;
                    left--;
                }
            }
        }
        System.out.print(S);
        for(int i = 0; i < right; i++)
            System.out.print(')');
    }
}