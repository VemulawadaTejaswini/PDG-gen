import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x == 0 && y == 0){
        int z = x; x = y; y = z;
        System.out.println(x + " " + y);
        }
    }
}
