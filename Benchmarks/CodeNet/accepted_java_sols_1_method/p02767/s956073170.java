import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        for (int i=0;i<=n-1;i++){
            x[i]=sc.nextInt();
        }
        int ans=10000000;
        for(int c=1;c<=100;c++){
            int total=0;
            for(int i=0;i<=n-1;i++){
                total+=(x[i]-c)*(x[i]-c);
            }
            if(total<ans){
                ans=total;
            }
        }
        System.out.println(ans);
    }

}
