import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input_text = scanner.nextLine();
        int round = Integer.parseInt(input_text);
        System.out.println(round * round);
        scanner.close();
    }
}