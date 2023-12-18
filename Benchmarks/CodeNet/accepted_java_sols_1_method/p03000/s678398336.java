import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int count = 1;
        int D = 0;
        for (int i = 0; i < N; i++) {
            D +=sc.nextInt();
            if(D > X){
                break;
            }
            count++;
        }

        System.out.println(count);
    }

}
