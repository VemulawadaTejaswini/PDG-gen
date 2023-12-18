import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        boolean[] bool = new boolean[n];
        for (int i=0;i<n;i++){
            h[i]=sc.nextInt();
            bool[i]=true;
        }
        for (int i=0;i<m;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            if (h[a]>h[b]){
                bool[b]=false;
            }else if (h[a]<h[b]){
                bool[a]=false;
            }else {
                bool[a]=false;
                bool[b]=false;
            }
        }
        int ans=0;
        for (int i=0;i<n;i++)if (bool[i])ans++;
        System.out.println(ans);
    }
}
