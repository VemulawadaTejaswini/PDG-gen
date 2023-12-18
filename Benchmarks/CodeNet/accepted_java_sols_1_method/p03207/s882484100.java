import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int ans=0;
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
            ans+=p[i];
        }
        Arrays.sort(p);
        out.println(ans-p[n-1]/2);
    }
}
