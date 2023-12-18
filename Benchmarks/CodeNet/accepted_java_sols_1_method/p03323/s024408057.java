import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split("[\\s]+");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        String answer = ":(";
        if(A <= 8 && B <= 8) {
          //true
          System.out.println("Yay!");
        } else {
          System.out.println(":(");
        }

    }
}
