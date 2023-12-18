import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String key = sc.next().toString();
        String cmp;

        String input = sc.next();
        while(! input.equals("END_OF_TEXT")) {
            cmp = input.toLowerCase();
            if(cmp.equals(key))
                count++;
            input = sc.next();
        }
        System.out.println(count);
    }
}

