import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();
        int sum = 0;
        int max = 0;
        for(int i = 0; i < 3; i++){
            sum = sum + A[i];
            if(A[i]>A[max]){
                max = i;
            }
        }
        if(sum - A[max] == A[max]){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
