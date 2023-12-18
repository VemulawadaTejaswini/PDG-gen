import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] A = new Long[n];
        Long sum = 0L;
        for(int i=0;i<n;i++){
            A[i] = sc.nextLong();
            if(i==0)continue;
            if(A[i-1]>A[i]){
                sum += A[i-1] - A[i];
                A[i] = A[i-1];
            }
        }
        System.out.println(sum);
    }
}