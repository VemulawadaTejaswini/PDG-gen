import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int max_ans = 0;
        int count = 0;
        for (int i=0; i<word.length(); i++) {
            if (isATGC(word.charAt(i))) {
                count++;
                max_ans = Math.max(count, max_ans);
            } else {
                count = 0;
            }
        }
        System.out.print(max_ans);
    }

    public static boolean isATGC(char c) {
        boolean result;
        result = c=='A' || c=='T' || c=='G' || c=='C';
        return result;
    }
}