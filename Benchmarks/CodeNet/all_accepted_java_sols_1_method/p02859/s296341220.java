import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if(input <= 100 && input >= 0) {
            System.out.println(input * input);
        }
    }
}
