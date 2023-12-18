import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();

         int y = (4*L - R)/2;
         int x = (L- 2*R)/2;

         if((2*x + 4*y) == R){
             System.out.println("Yes");
         }else{
             System.out.println("No");
        }
    }
}