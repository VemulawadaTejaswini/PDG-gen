import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key = in.next().toLowerCase();
        int count = 0;
        while(true) {
            String input = in.next();
            if(input.equals("END_OF_TEXT")) break;
            if(input.equalsIgnoreCase(key)) count++;
        }
        System.out.println(count);
    }
}