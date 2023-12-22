import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] work = new char[S.length()];
        char[] work2 = new char[T.length()];
        int counter = 0;
        for(int i = 0; i < S.length(); i++){
                work[i] = S.charAt(i);
                work2[i] = T.charAt(i);
                if(work[i] != work2[i]){
                    counter++;
                }
            }
        System.out.println(counter);
    }
}
