import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_text = scanner.nextLine();
        String[] data = input_text.split(" ");
        if(data[0].equals(data[1]) && data[0].equals(data[2])) {
            System.out.println("No");
        } else if (data[0].equals(data[1]) && !data[0].equals(data[2])) {
            System.out.println("Yes");
        } else if (data[0].equals(data[2]) && !data[0].equals(data[1])) {
            System.out.println("Yes");
        } else if (data[1].equals(data[2]) && !data[0].equals(data[1])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }

}