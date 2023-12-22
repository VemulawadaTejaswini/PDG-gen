import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        int count = 0;
        int min;
        int minnum;
        int n = sc.nextInt();
        int A[] = new int[n];
        for(i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            min = A[i];
            minnum = i;
            for(j=i+1;j<n;j++){
                if(A[j]<min){
                    min = A[j];
                    minnum = j;
                }
            }
            if(minnum != i){
                int r = A[minnum];
                A[minnum] = A[i];
                A[i] = r;
                count++;
            }
        }
        for(i=0;i<n;i++){
            System.out.printf("%d",A[i]);
            if(i != n-1) System.out.printf(" ");
        }
        System.out.printf("\n");
        System.out.printf("%d\n",count);
    }
}

