import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String result = "";
        for (int i = 0; i < str.length();i++) {
            String s = str.substring(i, i + 1);
            if (s.equals(s.toLowerCase())) {
                result += s.toUpperCase();
            } else {
                result += s.toLowerCase();
            }
        }
        System.out.println(result);
    }
}