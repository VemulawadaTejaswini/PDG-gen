import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(((a % 2)*(b % 2)) == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}