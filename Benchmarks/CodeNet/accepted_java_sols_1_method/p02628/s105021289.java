import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ar[]= new int[n];
        for (int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int sum=0;
        Arrays.sort(ar);
        for (int i=0;i<k;i++){
            sum+=ar[i];
 
        }
        System.out.println(sum);
    }
}