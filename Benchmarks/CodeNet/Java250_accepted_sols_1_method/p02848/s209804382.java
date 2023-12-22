import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int N = Integer.parseInt(sc.nextLine());
            String S = sc.next();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < S.length(); i++){
                int ascii = (int)S.charAt(i);
                ascii = ascii + N;
                if (ascii > (int)'Z') {
                    ascii = ascii % (int)'Z' + (int)'A' -1;
                }
                result.append((char)ascii);
            }
            System.out.println(result.toString());
        }
    }
}