import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i]= scan.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.printf("%d",A[i]);
            if(i!=0)System.out.printf(" ");
        }
        System.out.printf("\n");
    }
}
