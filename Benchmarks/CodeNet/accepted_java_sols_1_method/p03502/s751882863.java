import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 0;
        int n1 = n;
        while (n1 > 0){
            f += n1 % 10;
            n1 = n1/10;
        }
        System.out.println(n % f == 0?"Yes":"No");
    }
}
