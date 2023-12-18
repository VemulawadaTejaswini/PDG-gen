import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            for(int i = 0; i < 5; i++) {
                if(scanner.nextInt() == 0) {
                    System.out.println(i + 1);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
