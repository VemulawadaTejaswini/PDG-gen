import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        if (a <= b)
            System.out.println("unsafe");
        else {
            System.out.println("safe");
        }
    }

}
