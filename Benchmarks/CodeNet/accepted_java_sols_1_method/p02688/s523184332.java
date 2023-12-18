import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] sunuke = new boolean[n];
        for (int i=0;i<k;i++){
            int d = sc.nextInt();
            for (int j=0;j<d;j++){
                sunuke[sc.nextInt()-1]=true;
            }
        }
        int ans = 0;
        for (int i=0;i<n;i++)if (!sunuke[i])ans++;
        System.out.println(ans);
    }
}
