import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();

        char[] alphabet = new char[26];
        char base = 'A';
        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = base++;
        }
        StringBuilder sb = new StringBuilder();
        for(char c: S.toCharArray()) {
            for(int i = 0; i < alphabet.length; i++) {
                if(alphabet[i] == c) {
                    sb.append(alphabet[(i + N) % alphabet.length]);
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }

}
