import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i] = a.nextInt();
        }
        int flag = 1;
        int count = 0;
        while(flag==1){
            flag = 0;
            for(int i=n-1; i>=1; i--){
                if(A[i] < A[i-1]){
                    A[i] = A[i] + A[i-1];
                    A[i-1] = A[i] - A[i-1];
                    A[i]= A[i] - A[i-1];
                    flag = 1;
                    count++;
                }
            }       
        }
        for(int i=0; i<n; i++){
            System.out.print(A[i]);
            if(i<n-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
