import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            fun(s.nextInt(),s.nextInt(),s.nextInt());
        }
    }
    
    static void fun(int a,int b,int c){
        int x=0,y=Math.min(a,b)*Math.min(a,b),ma=Math.max(a,b);
        x+=Math.max(ma,c)*Math.max(ma,c);
        y+=Math.min(ma,c)*Math.min(ma,c);
        if(x==y)System.out.println("YES");
        if(x!=y)System.out.println("NO");
        
    }
}
