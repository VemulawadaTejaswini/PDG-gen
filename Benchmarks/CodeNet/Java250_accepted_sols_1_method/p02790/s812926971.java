import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        String mojiA = "";
        String mojiB = "";

        for(int i = 0; i < A; i++){
            mojiB = mojiB + String.valueOf(B);
        }
        for(int i = 0; i < B; i++){
            mojiA = mojiA + String.valueOf(A);
        }

        if(mojiA.compareTo(mojiB) < 0){
            System.out.println(mojiA);
        }else{
            System.out.println(mojiB);
        }
        
        sc.close();

    }
}