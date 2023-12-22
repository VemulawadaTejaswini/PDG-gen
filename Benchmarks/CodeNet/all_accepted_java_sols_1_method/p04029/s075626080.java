import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = 0;
        for (int n = 1; n <= num; n ++) {
            sum += n;
        }
        System.out.println(sum);
    }
}