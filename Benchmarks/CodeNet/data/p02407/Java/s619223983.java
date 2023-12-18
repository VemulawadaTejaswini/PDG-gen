import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        int i=0, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int A[] = new int[n];
        
        while(i < n){
            A[i] = sc.nextInt();
            i++;
        }
        i = n-1;
        while(i >= 0){
            if(i == 0) System.out.println(A[0]);
            else System.out.print(A[i]+" ");
            i--;
        }
    }
}
