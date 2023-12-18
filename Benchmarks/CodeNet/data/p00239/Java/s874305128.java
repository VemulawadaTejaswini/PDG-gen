import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int s[]=new int[n];
            int p[]=new int[n];
            int q[]=new int[n];
            int r[]=new int[n];
            int k[]=new int[n];
            for(int i=0;i<n;i++){
                s[i]=sc.nextInt();
                p[i]=sc.nextInt();
                q[i]=sc.nextInt();
                r[i]=sc.nextInt();
                k[i]=4*(p[i]+r[i])+9*q[i];
            }
            int P,Q,R,C;
            P=sc.nextInt();
            Q=sc.nextInt();
            R=sc.nextInt();
            C=sc.nextInt();
            int cnt=0;
            for(int i=0;i<n;i++){
                if(p[i]<=P&&q[i]<=Q&&r[i]<=R&&k[i]<=C){
                    cnt++;
                    System.out.println(s[i]);
                }
            }
            if(cnt==0){
                System.out.println("NA");
            }
        }
    }
}
