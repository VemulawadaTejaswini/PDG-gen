import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int ramenPrice = 700;

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == 'o') {
                ramenPrice += 100;
            }
        }
        System.out.println(ramenPrice);
    }
}
