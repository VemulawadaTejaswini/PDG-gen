import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = 1;
        int count = sc.nextInt();
        int added = sc.nextInt();
        while (count != 0 && added >= current) {
            current *= 2;
            count--;
        }
        while (count != 0) {
            current += added;
            count--;
        }
        System.out.println(current);
    }
}
