import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n+1];
        int[] t2 = new int[n+1];
        for(int i =1;i<=n;i++){
            t[i]=sc.nextInt();
            t2[i] = t[i];
        }
        int m = sc.nextInt();
        for(int i =0;i<m;i++){
            int p =sc.nextInt();
            int x =sc.nextInt();
            int cnt =0;
            t2[p]=x;
            for(int j =1;j<=n;j++){
                cnt+=t2[j];
            }
            System.out.println(cnt);
            for(int j =1;j<=n;j++){
                t2[j]=t[j];
            }


        }

    }
}




