import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans= 0;
        int n = sc.nextInt();
        char[] c  = sc.next().toCharArray();

        for(int i=1;i<n;i++){
            int temp = 0;
            HashSet<Character> alphabet = new HashSet<>();
            for(int j=0;j<i;j++)alphabet.add(c[j]);
            for(int j=i;j<n;j++){
                if(alphabet.contains(c[j])){
                    temp++;
                    alphabet.remove(c[j]);
                }
            }
            ans = Math.max(ans,temp);
        }

        System.out.println(ans);

    }
}


