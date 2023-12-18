import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        int j,cnt=0;
        int min=999999999;
        for(int i=0;i<n;i++){
            min=Math.min(min,p[i]);
            if(min==p[i]) cnt++;
        }
        System.out.println(cnt);
    }
}