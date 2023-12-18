import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b =sc.nextInt(),m=sc.nextInt();
        int[] an = new int[a];
        int[] bn = new int[b];
        int[] x = new int[m];
        int[] y = new int[m];
        int[]c = new int[m];
        for(int i = 0;i<a;i++){
            an[i] = sc.nextInt();
        }
        for(int i = 0;i<b;i++){
            bn[i] = sc.nextInt();
        }
        for(int i = 0;i<m;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int ans = 1001001001;
        for(int i=0;i<m;i++){
            int tmp = an[x[i]-1]+bn[y[i]-1]-c[i];
            ans = Math.min(ans,tmp);
        }
        Arrays.sort(an);
        Arrays.sort(bn);
        ans = Math.min(ans,an[0]+bn[0]);
        System.out.println(ans);
    }
}