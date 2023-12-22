import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++) a[i]=sc.nextInt();
        int[] rec = new int[9];
        for(int i=0;i<N;i++){
            if(a[i]>=3200) rec[8]++;
            else rec[a[i]/400]++;
        }
        int ans1 = 0;
        for(int i=0;i<=7;i++){
            if(rec[i]>0) ans1++;
        }
        int ans2 = ans1+rec[8];
        System.out.print(Math.max(1,ans1));
        System.out.print(" ");
        System.out.print(ans2);
    }
}
 