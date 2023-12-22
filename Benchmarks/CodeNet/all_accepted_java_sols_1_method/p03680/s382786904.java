import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt()-1;
        sc.close();
        int now=0;
        int step=0;
        while(true){
            if(now==1){
                System.out.println(step);
                break;
            }
            else if(step>n){
                System.out.println(-1);
                break;
            }
            else{
                now=a[now];
            }
            step++;
        }
    }
    
}