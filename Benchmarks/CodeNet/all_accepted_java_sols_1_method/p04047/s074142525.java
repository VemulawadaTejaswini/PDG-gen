import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] l=new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            l[i]=sc.nextInt();
        }
        Arrays.sort(l);
        long ans=0;
        for (int i = 0; i < 2*n; i++) {
            if(i%2==0)ans+=l[i];
        }
        out.println(ans);
    }
}