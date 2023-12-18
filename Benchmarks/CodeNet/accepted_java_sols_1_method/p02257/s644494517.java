import java.util.Scanner;
class Main{
    public static void main(String[] av){
        Scanner sc=new Scanner(System.in);
        int m = 0;
        int a;
        int cnt = 0;
        int n = sc.nextInt();
        int[] d=new int[n];
        for(int i=0; i<n;i++){
            a = sc.nextInt();
            d[i] = a;
            if(m < a){
                m = a;
            }
        }
   
        boolean[] p=new boolean[m+1];

        p[1]=false;

        for(int i=2; i<=m ;i++){
             p[i]=true;
        }
        for(int i=2; i<=Math.sqrt(m);i++){
            if(p[i]) for(int j=i*2; j<=m; j+=i) p[j]=false;
        }
        for(int i=0; i<n ;i++){
            if(p[d[i]]){
                cnt = cnt+1;
            }
        }
        System.out.println(cnt);
    }
}

