import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        char s[]=in.next().toCharArray(),t[]=in.next().toCharArray();;
        int n=s.length,l=t.length,max=l,cnt=0;
        for(int i=0;i<n-l+1;i++){
            cnt=0;
            for(int j=0;j<l;j++){
                if(s[i+j]!=t[j])    cnt++;
            }
            max=Math.min(max,cnt);
        }
        System.out.println(max);
    }
}