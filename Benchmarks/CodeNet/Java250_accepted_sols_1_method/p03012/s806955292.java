import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int po[]=new int[n];
        for(int i=0;i<n;i++){
            po[i]=(i==0)?sc.nextInt():sc.nextInt()+po[i-1];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            ans=Math.min(ans,Math.abs(po[i]-(po[n-1]-po[i])));
        }
        System.out.println(ans);
    }
}
