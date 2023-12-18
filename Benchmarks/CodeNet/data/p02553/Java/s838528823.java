import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        
        long ans=0;
        if(a>=0 && b>=0 && c>=0 && d>=0)
            ans=b*d;
        else if(a<=0 && b<=0 && c<=0 && d<=0)
            ans=a*c;
        else if(a<=0 && b>=0 && c<=0 && d>=0)
            ans=(long)Math.max(a*c, b*d);
        else if(a<=0 && b<=0 && c>=0 && d>=0)
            ans=b*c;
        else if(a>=0 && b>=0 && c<=0 && d<=0)
            ans=a*d;
       
        System.out.println(ans);
    }
}
