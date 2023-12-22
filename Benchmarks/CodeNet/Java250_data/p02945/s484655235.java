import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(maxAnswer(a, b));
    }

    private static Integer maxAnswer(Integer a, Integer b){
        int plus = a + b;
        int minus = a - b;
        int multiply = a * b;
        return Math.max(plus, Math.max(minus, multiply));
    }
}
