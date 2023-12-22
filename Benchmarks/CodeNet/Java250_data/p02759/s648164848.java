import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int value = Integer.valueOf(line);
        System.out.printf("%d", (value + 1) / 2);
    }
}