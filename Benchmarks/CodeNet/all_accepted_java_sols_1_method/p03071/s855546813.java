import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        int b = sc.nextInt();
      
        int result = Math.max(Math.max(a+a-1, b+b-1), a+b);
        System.out.println(result);
    }
}
