import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        String[] array = scanner.nextLine().split(" ");

        String prep = "";
        int count = 0;
        int current = 0;

        for (String anArray : array) {
            if (anArray.equals(prep)) {
                ++current;
            } else {
                count += current / 2;
                prep = anArray;
                current = 1;
            }
        }
        count += current / 2;
        System.out.println(count);
    }
}