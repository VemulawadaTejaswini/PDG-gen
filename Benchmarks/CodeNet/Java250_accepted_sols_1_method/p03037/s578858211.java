import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        for(int i = 0;i<m;i++){
            l[i]=sc.nextInt();
            r[i]=sc.nextInt();
        }
        Arrays.sort(l);
        Arrays.sort(r);
        int count = 0;
        for(int i = 1;i<=n;i++){
            if(l[m-1]<=i&&r[0]>=i)count++;
        }
        System.out.println(count);
    }
}
