import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((int)cubed(x));
    }
    
    public static double cubed(int x) {
        return Math.pow(x, 3);
    }
}
