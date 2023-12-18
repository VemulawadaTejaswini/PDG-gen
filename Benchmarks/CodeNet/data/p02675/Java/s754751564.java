import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n_row = sc.nextInt();
        int n = n_row % 10;

        if(n == 0 || n == 1 || n == 6 || n == 8){
            System.out.println("pon");
        }else if(n == 3){
            System.out.println("bon");
        }else{
            System.out.println("hon");
        }
    }
}
