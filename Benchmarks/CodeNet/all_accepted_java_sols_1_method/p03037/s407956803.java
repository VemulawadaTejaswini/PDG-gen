import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=0;
        int r=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            l=Math.max(l,sc.nextInt());
            r=Math.min(r,sc.nextInt());
        }
        System.out.println(((r-l)<0)?0:r+1-l);
    }
}
