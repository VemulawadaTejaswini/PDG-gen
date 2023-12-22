import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans = 1;
        long[] s = new long[n];
        for(int i =0;i<n;i++){
            s[i]=Long.parseLong(sc.next());
        }
        Arrays.sort(s);
        for(int i = 0;i<n;i++){
            if(s[i]==0){
                ans = 0;
                break;
            }
            if(Math.log10(s[i])+Math.log10(ans)>18||ans*s[i]>1000000000000000000L){
                ans = -1;
                break;
            }
            ans*=s[i];
        }
        System.out.println(ans);
    }
}