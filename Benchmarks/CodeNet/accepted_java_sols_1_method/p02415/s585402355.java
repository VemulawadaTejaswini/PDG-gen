import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String str;
        char c;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            str = sc.next();
            for(int i = 0; i < str.length(); i++) {
                c = str.charAt(i);
                if (c >= 'A' && c <= 'z') {
                    if (c >= 'a' && c <= 'z') {
                        System.out.print((char)(c + 'A' - 'a'));
                    } else {
                        System.out.print((char)(c + 'a' - 'A'));
                    }
                } else {
                    System.out.print(c);
                }
            }
            if (sc.hasNext())
                System.out.print(" ");
        }
        System.out.println();
    }
}
