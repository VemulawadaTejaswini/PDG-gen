import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
            if(i % 2 == 0) {
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
