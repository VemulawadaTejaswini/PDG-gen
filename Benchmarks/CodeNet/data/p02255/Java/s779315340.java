import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        int i,j,v;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int A[] = new int[n];

        //Initialize data
        for(i=0; i<n ; i++){
            int num = scan.nextInt();
            A[i] = num;
        }
        //sort
        for(i = 1 ; i<n ; i++){
            v = A[i];
            j = i-1;
            while(j>=0 && A[j]>v){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = v;
            for(int k=0; k<n ; k++){
                System.out.print(A[k] + " ");
            }
            System.out.print("\n");
        }
    }
}

