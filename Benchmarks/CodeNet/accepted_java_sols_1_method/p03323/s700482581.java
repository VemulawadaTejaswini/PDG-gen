import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int max = Math.max(A,B);
        String result = "Yay!";
        if(max>8) result = ":(";
        System.out.println(result);
    }
}