import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<A.length;++i)
            A[i]=sc.nextInt();
        Arrays.sort(A);
        long sum=0;
        for(int i=A.length-1;i>0;--i) {
            sum+=A[i];
        }
        System.out.println(sum);
    }
}