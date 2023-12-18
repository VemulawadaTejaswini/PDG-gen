import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            String S=sc.next();
            int n=S.length();
            int ans=0;
            if(n==1 && S.charAt(0)=='0') break;
            for(int i=0;i<n;i++) ans+=(S.charAt(i)-'0');
            System.out.println(ans);
        }
        sc.close();
    }
}
