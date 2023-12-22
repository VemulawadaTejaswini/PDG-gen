import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        if ("AAA".equals(inputData) || "BBB".equals(inputData)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
    }
}