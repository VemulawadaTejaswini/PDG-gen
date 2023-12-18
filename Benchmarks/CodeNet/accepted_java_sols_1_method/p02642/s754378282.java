import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int[] b = new int[1000001];
        Arrays.fill(b,0);
        int ans = 0;
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }

        for(int i=0;i<n;i++){
            if(b[a[i]]!=0){
                b[a[i]]=2;
                continue;
            }
            for(int j=a[i];j<1000001;j+=a[i]){
                b[j]++;
            }
        }
        for (int i=0;i<n;i++) {
            if (b[a[i]]==1) ans++;
        }

        System.out.println(ans);
     scn.close();

    }

}