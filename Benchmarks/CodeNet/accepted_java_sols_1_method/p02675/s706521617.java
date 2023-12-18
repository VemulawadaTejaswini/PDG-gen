import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int x = n % 10;
        if(n < 1000){
            if(x == 2 || x == 4 || x == 5 || x == 7 || x == 9){
                System.out.println("hon");
            }
            if(x == 0 || x == 1 || x == 6 || x == 8){
                System.out.println("pon");
            }
            if(x == 3){
                System.out.println("bon");
            }
        }
    }
}