import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] b = new boolean[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=true;
        }
        Arrays.sort(a);
        for (int i=0;i<n;i++){
            if (b[i]){
                for (int j=i+1;j<n;j++){
                    if (a[j]%a[i]==0)b[j]=false;
                    if (a[i]==a[j])b[i]=false;
                }
            }
        }
        int ans = 0;
        for (int i=0;i<n;i++)if (b[i])ans++;
        System.out.println(ans);
    }
}
