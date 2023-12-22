import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        int i;
        int[] count = new int[26];
        while(sc.hasNextLine()) {
            line = sc.nextLine().toLowerCase();
            for (i = 0; i < line.length(); i++) {
                if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') count[line.charAt(i) - 'a'] += 1;
            }
        }
        for (i = 0; i < 26; i++) {
            System.out.print((char)(i + 'a'));
            System.out.println(" : " + count[i]);
        }
    }
}

