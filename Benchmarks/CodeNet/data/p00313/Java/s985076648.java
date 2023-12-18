import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int b[]=new int[n+1];
        int x[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            a[i]=1;
            b[i]=0;
            x[i]=0;
        }
        int an=sc.nextInt();
        for(int i=0;i<an;i++){
            int q=sc.nextInt();
            a[q]=0;
        }
        int bn=sc.nextInt();
        for(int i=0;i<bn;i++){
            int q=sc.nextInt();
            b[q]=1;
        }
        int xn=sc.nextInt();
        for(int i=0;i<xn;i++){
            int q=sc.nextInt();
            x[q]=1;
        }
        int cnt=0;
        for(int i=1;i<n+1;i++){
            if(a[i]==1||b[i]==1){
                if(x[i]==1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
