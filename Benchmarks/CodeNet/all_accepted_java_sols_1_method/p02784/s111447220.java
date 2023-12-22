import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j, H, N, T=0;
        int[] A = new int[100000];
        H = scan.nextInt();
        N = scan.nextInt();
        for(j=0; j<N; j++){
            A[j] = scan.nextInt();
        }
        for(j=0; j<N; j++){
            T = T+A[j];
        }
        if(T>=H) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}