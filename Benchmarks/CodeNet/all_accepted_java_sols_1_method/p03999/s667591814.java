import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        long ans=0;
        String[]ss=s.split("",0);
        for(int i=0;i<Math.pow(2,n-1);i++){
            String po="";
            for(int j=0;j<n;j++){
                po+=ss[j];
                if((1&i>>j)==1)po+="a";
            }
            String s2[]=po.split("a",0);
            for(int j=0;j<s2.length;j++)ans+=Long.parseLong(s2[j]);
        }
        System.out.println(ans);
    }
    
 
}
