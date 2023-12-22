import java.util.Scanner;

    public class Main{
    public static void main(String[] args){
        int i,count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S;
        S = new int[n];
        for(i=0;i<n;i++){
            S[i]=sc.nextInt();
        } 
        int q = sc.nextInt();
        int[] T;
        T = new int[q];
        for(i=0;i<q;i++){
            T[i]=sc.nextInt();
        }
        for(i=0;i<q;i++){
            int l=0,r=n-1;
            while(l<r){
                int m=(l+r)/2;
                if(S[m]<T[i]) l = m+1;
                else r=m;
            }
            if(S[l]==T[i]) count++;
        }
        System.out.println(count);
        sc.close();
    }
}
