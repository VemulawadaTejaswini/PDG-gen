import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String w = scan.nextLine().toLowerCase();

        int nMatch = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.equals("END_OF_TEXT"))
                break;

            String[] words = line.toLowerCase().split("\\s+");
            for (String word : words) {
                if (w.equals(word)) {
                    nMatch++;
                }
            }
        }

        System.out.println(nMatch);
    }
}