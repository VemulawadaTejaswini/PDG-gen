import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int[] alphabets = new int[26];

        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                String line = sc.nextLine();

                char[] cs = line.toLowerCase().toCharArray();

                // aを0とする

                for (int i = 0; i < cs.length; i++) {
                    if (cs[i] >= 'a' && cs[i] <= 'z') {
                        alphabets[cs[i] - 'a']++;
                    }
                }
            }
        } catch (java.util.NoSuchElementException e) {
            for (int i = 0; i < 26; i++) {
                char a = (char) ('a' + i);
                System.out.println(a + " : " + alphabets[i]);
            }

        }

    }

}
