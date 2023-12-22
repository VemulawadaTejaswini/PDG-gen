import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];


        for(int i=0;i<n;i++)a[i]=sc.nextLong();

        long ans =0;
        boolean allodd = true;

        for(int i=0;i<n;i++)ans+=two(a[i]);

        System.out.println(ans);

    }

    private static long two(long num){
        if(num%2==1)return 0;

        num=num/2;
        return two(num)+1;
    }

}


