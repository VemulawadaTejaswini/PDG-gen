import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num <1 || num > 100){
          System.out.println("Out of range");
        } else{
          System.out.println( (num+1) / 2 );
        }
    }
}
