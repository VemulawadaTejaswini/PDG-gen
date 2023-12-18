public class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int a;
        if(n % 1000 == 0) {
            a = n / 1000;
        } else {
            a = (n / 1000) + 1;
        }
        int b = a * 1000;
        int result = b - n;
        System.out.println(result);
    }
}