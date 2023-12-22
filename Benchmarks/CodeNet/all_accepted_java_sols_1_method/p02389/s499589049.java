import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int area = x * y;
        int perimeter = 2 * (x + y);
        System.out.println(area + " " + perimeter);
    }
}
