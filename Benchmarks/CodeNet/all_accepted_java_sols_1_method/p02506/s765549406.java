import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int noMatch = 0;
        String src = scan.nextLine().toLowerCase();
        while (scan.hasNext()) {
            String line = scan.nextLine();
            if (line.equals("END_OF_TEXT"))
                break;
            for (String word: line.toLowerCase().split("\\s+"))
                if (src.equals(word))
                    noMatch++;
        }

        System.out.println(noMatch);
    }
}