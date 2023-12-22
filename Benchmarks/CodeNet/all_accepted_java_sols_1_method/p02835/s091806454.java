import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        if (N+A+B > 21){
            System.out.println("bust");
        }else {
            System.out.println("win");
        }

//        for (int i = 0; i < N; i++){
//            for (int j = 0; j < A; j++){
//
//            }
//        }
    }
}
