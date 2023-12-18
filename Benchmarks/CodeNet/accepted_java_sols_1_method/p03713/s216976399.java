import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        long[] l = new long[2];
        l[0] = sc.nextLong();
        l[1] = sc.nextLong();
        long ans =  l[0] * l[1];
        long[] s = new long[3];
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= l[i]; j++) {
                s[0]=(long)j*l[abs(1-i)];
                s[1]=(l[i]-(long)j)/2*l[abs(1-i)];
                s[2]=l[0]*l[1]-s[0]-s[1];
                Arrays.sort(s);
                ans=min(ans,s[2]-s[0]);
                s[0]=(long)j*l[abs(1-i)];
                s[1]=l[abs(1-i)]/2*(l[i]-(long)j);
                s[2]=l[0]*l[1]-s[0]-s[1];
                Arrays.sort(s);
                ans=min(s[2]-s[0],ans);
            }
        }
        out.println(ans);
    }
}