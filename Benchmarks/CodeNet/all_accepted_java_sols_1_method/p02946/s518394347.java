import java.util.Scanner;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();

        int start = x- k + 1;
        int end = x + k - 1;

        if(start < -1000000){
            start = -1000000;
        }
        if(end > 1000000){
            end = 1000000;
        }

        for (int i=start; i<end+1;i++){
            System.out.print(i + " ");
        }

    }
}