import java.util.Scanner;

public class Main{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String stations = scanner.nextLine();
        if (stations.contains("AB") || stations.contains("BA")) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}