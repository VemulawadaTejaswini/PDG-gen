import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        while(!(n%2==0)) {
            n *= 2;
        }
        System.out.println(n);
    }
}