import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
    
        double circumference;
        double PI = 3.14159265;
        circumference = 2 * PI * R;
        System.out.println(circumference);
    }
}