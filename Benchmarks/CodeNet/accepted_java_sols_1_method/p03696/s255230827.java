import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int right = 0, left = 0;
        int N = s.nextInt();
        String str = s.next();
        char[] cstr = str.toCharArray();
        for(int i = 0; i < N; i++){
            if(cstr[i] == ')'){
                if(left > 0){
                    left--;
                }else
                    right++;
            } else {
                left++;
            }
        }
        String ans = "";
        for(int i = 0; i < right; i++)
            ans = ans + "(";
        ans = ans + str;
        for(int i = 0; i < left; i++)
            ans = ans + ")";
        System.out.println(ans);
    }
}
