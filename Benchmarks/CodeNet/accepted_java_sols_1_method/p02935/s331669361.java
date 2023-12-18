import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int A[]=new int[n];
//        double B[]=new double[n];

        for(int i=0;i<n;i++){
            A[i]=scan.nextInt();
        }

        double c=0;
        Arrays.sort(A);
        c=(A[0]+A[1])/2.0;
        for(int i=2;i<n;i++){
            c=(c+A[i])/2.0;
        }
        System.out.println(c);
    }
}
