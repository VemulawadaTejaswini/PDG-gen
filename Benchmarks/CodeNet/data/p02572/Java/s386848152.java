import java.util.*;

public class Main {
    static int findProductSum(long A[], int n) {
        long array_sum = 0;
        for (int i = 0; i < n; i++)
            array_sum =( array_sum + A[i]);
        long array_sum_square = (array_sum * array_sum);
        long individual_square_sum = 0;
        for (int i = 0; i < n; i++){
            individual_square_sum = individual_square_sum + A[i] * A[i];
        }
        int ans=(int)Math.abs((array_sum_square-individual_square_sum)%1000000007);
        ans=ans/2;
        return ans;
    }

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextLong();
        System.out.println(findProductSum(arr, n));
    }
}