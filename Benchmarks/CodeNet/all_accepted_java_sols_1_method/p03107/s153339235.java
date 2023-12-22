import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int zeroCnt = 0;
        int oneCnt = 0;
        int min = 0;
        for(int i = 0;i <S.length();i++){
            if(S.charAt(i) == '0'){
                zeroCnt++;
            }
        }
        oneCnt = S.length()-zeroCnt;
        min = Math.min(zeroCnt,oneCnt);
        System.out.println(min*2);
    }
}
