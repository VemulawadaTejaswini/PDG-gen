import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for (int i=0;i<n;i++){
            int A = sc.nextInt();
            a[i]=A;
            if (i%2==0)sum+=A;
            else sum-=A;
        }
        System.out.print(sum+" ");
        long ins = sum/2;
        for (int i=1;i<n;i++){
            ins = a[i-1]-ins;
            System.out.print(2*ins+" ");
        }
        System.out.println();
    }
}
