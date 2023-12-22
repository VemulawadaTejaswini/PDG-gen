import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt();
        if (x >= a && x <= a + b) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
