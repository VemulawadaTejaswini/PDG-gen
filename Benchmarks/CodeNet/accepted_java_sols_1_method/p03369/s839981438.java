import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String n = sc.next();
        int count = n.charAt(0) == 'o' ? 1 : 0;
        count += n.charAt(1) == 'o' ? 1 : 0;
        count += n.charAt(2) == 'o' ? 1 : 0;
        System.out.println(count * 100 + 700);
    }
}