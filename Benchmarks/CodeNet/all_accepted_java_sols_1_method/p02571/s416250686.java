import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int changeCount =  T.length();
        //比較する最初の文字を決める
        for(int start=0; start<=S.length()-T.length(); start++) {
            int count = 0;
            for(int i=0; i<T.length(); i++) {
                if(S.charAt(start+i)!=(T.charAt(i)))  {
                    count ++;
                }
            }
            if(changeCount > count) {
                changeCount = count;
            }
        }
        System.out.println(changeCount);
    }
}
