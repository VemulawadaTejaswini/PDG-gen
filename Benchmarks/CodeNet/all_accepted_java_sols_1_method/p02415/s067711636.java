import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if('a' <= c && c <= 'z')
                c += 'A' - 'a';
            else if('A' <= c && c <= 'Z')
                c -= 'A' - 'a';
            System.out.print(c);
        }
    System.out.println();
    }
}
