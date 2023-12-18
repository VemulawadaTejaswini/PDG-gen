import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int w,n,x,y,c;
    public static int[] ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        w=sc.nextInt();
        n=sc.nextInt();
        ans=new int[w+1];
        for(int i=1;i<=w;i++) ans[i]=i;
        for(int i=0;i<n;i++){
            String s;
            s=sc.next();
            String[] split=s.split(",");
            x=Integer.parseInt(split[0]);
            y=Integer.parseInt(split[1]);
            swap();
        }
        sc.close();
        for(int i=1;i<=w;i++) System.out.println(ans[i]);
    }
    private static void swap(){
        c=ans[x];
        ans[x]=ans[y];
        ans[y]=c;
    }
}

