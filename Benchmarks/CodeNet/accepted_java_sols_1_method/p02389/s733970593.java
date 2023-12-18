import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int area = a*b;
        int perimeter = 2*(a+b);
        System.out.println(area+" "+perimeter);
    }
}
