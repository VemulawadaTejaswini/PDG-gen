import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String w = scan.nextLine().toLowerCase();

        int nMatches = 0;
        while (scan.hasNext()) {
            String word = scan.next();
            if (rawWord.equals("END_OF_TEXT"))
                break;

            String lowerdWord = word.toLowerCase();
            if (w.equals(lowerdWord))
                nMatches++;
        }

        System.out.println(nMatches);
    }
}