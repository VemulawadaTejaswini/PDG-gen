import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lsn = 65;
        int ssn = 97;

        char large[] = new char[26];
        char small[] = new char[26];
        char sign[] = {' ', ',', '.'};

        for (int i = 0; i < 26; i++) {
            large[i] = (char) lsn++;
            small[i] = (char) ssn++;
        }

        String str = sc.nextLine();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if (s.matches("[A-Z]")) {
                ans.append(s.toLowerCase());
            } else if (s.matches("[a-z]")) {
                ans.append(s.toUpperCase());
            } else {
                ans.append(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}