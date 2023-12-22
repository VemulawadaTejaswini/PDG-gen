import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        int c = 0;

        while (true) {
            String w = sc.next();
            if (w.equals("END_OF_TEXT")) {
                break;
            }

            if (w.toLowerCase().equals(W)) {
                c++;
            }
        }

        System.out.println(c);
    }
}