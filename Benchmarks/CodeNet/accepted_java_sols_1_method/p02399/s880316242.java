import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int firstNumber     = sc.nextInt();
        int secondNumber    = sc.nextInt();
        
        System.out.print(firstNumber / secondNumber);
        System.out.print(" " + firstNumber % secondNumber + " ");
        System.out.printf("%.10f\n", (double) firstNumber / (double) secondNumber);
    }
}
