import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[] ans=new int[n-1];
        int tmp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                tmp=Math.min(j-i, Math.abs(i+1-x)+Math.abs(j+1-y)+1);
                ans[tmp-1]++;
            }
        }
        for(int i=0;i<n-1;i++){
            System.out.println(ans[i]);
        }
    }
    
}
