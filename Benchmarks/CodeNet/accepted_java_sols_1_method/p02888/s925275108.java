import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i=0;i<n;i++)l[i]=sc.nextInt();
        Arrays.sort(l);
        long ans = 0;
        for (int i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                boolean b3 = true;
                for (int k=j+1;k<n&&b3;k++){
                    if (l[i]+l[j]<=l[k])b3=false;
                    if (l[i]+l[j]>l[k]&&l[j]+l[k]>l[i]&&l[k]+l[i]>l[j])ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
