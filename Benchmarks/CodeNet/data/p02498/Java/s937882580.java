import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String line = scan.nextLine();
            for (char ch: line.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    ch = Character.toLowerCase(ch);
                } else if (Character.isLowerCase(ch)) {
                    ch = Character.toUpperCase(ch);
                }
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}