import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] L = new int[N];
        for(int i=0;i<N;i++) L[i] = sc.nextInt();
        int m=0,cnt =0;
        int g = 1,g2=1;
        while(g2<=N){
            g*=3;
            g2+=g;
            m++;
        }
        int G [] = new int [m];
        G[m-1]=1;
        g = 1;
        for(int i=1;i<m;i++){
            g*=3;
            G[m-i-1]=G[m-i]+g;
        }
        for(int i=0;i<m;i++) cnt = insertion_sort(L,N,G[i],cnt);
        System.out.println(m);
        for(int i=0;i<m;i++){
            if(i!=m-1) System.out.print(G[i]+" ");
            else  System.out.println(G[i]);
        }
        System.out.println(cnt);
        for(int i:L) System.out.println(i);
    }
    public static int insertion_sort(int [] L,int N,int g,int cnt){
        for(int i=g;i<N;i++){
            int v = L[i];
            int j = i-g;
            while(j>=0&&L[j]>v){
                L[j+g]=L[j];
                j = j-g;
                cnt++;
            }
            L[j+g]=v;
        }
        return cnt;
    }
}
