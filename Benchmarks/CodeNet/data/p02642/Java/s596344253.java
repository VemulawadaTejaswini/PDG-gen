import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hash = new HashMap<>();
        int n = sc.nextInt();
        boolean[] ar = new boolean[1000001];
        int[] a = new int[n];
        int ji = sc.nextInt();
        a[0]=ji;
        ar[ji]=true;
        boolean b = true;
        for (int i=1;i<n;i++){
            int j = sc.nextInt();
            a[i]=j;
            ar[j]=true;
            b &= a[i-1]==a[i];
        }
        if (b){
            System.out.println(0);
        }else {
            Arrays.sort(a);
            for (int i=0;i<n;i++){
                int c = 2;
                while (a[i]*c<=a[n-1]){
                    ar[a[i]*c]=false;
                    c++;
                }
            }
            int ans = 0;
            for (int i=0;i<1000001;i++)if (ar[i])ans++;
            System.out.println(ans);
        }
    }
}
