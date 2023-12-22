
import java.util.Arrays;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        Arrays.sort(a);
        int mid=a[n/2];
        int prev = a[n/2-1];
       // System.out.println(mid +" " + prev);
        if(mid==prev)
            System.out.println(0);
        else{
            int ans=mid-prev;
            System.out.println(ans);
        }
    }
}
