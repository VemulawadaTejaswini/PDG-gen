import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        int[] s = new int[n];
        int[] f = new int[n];
        for (int i=1;i<n;i++){
            c[i]=sc.nextInt();
            s[i]=sc.nextInt();
            f[i]=sc.nextInt();
        }
        for (int i=1;i<n;i++){
            long time = 0;
            for (int j=i;j<n;j++){
                if (time<=s[j])time=s[j];
                else {
                    if (time%f[j]!=0)time+=f[j]-(time%f[j]);
                }
                time+=c[j];
            }
            System.out.println(time);
        }
        System.out.println(0);
    }
}
