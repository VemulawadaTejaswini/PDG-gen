import java.security.SecureRandom;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (a[i]+a[j]>a[k]&&a[i]!=a[j]&&a[j]!=a[k])count++;
                }
            }
        }
        System.out.println(count);
    }

}