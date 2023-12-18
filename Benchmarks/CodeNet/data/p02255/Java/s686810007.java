import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []A = new int[n];
        for(int i=0;i<n;++i){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n;++i){
            int tmp = A[i];
            int j = i - 1;
            while(j>=0&&A[j]>tmp){
                A[j+1] = A[j];
                --j;
            }
            A[j+1] = tmp;
            for(j=0;j<n;++j){
                if(j!=0)System.out.print(" ");
                System.out.print(A[j]);
            }
            System.out.println("");
        }
    }
}

