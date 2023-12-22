import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();

        if(W >= S){
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }


        scanner.close();
    }

}
