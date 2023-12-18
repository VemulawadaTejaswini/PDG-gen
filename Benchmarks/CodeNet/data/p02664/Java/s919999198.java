import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder str = new StringBuilder();
        for (int i=0;i<input.length();++i)
        {
            if (input.charAt(i)=='?')
                str.append('D');
            else
                str.append(input.charAt(i));
        }
        System.out.println(str.toString());
    }
}
