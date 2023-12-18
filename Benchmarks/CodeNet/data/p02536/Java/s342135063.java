import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),m=in.nextInt();
        int pre[]=new int[n];
        for(int i=0;i<m;i++){
            pre[in.nextInt()-1]=1;
            pre[in.nextInt()-1]=1;
        }
        for(int i=1;i<n;i++)    pre[i]+=pre[i-1];
        System.out.println(Math.max(n-pre[n-1],0));
    }
}