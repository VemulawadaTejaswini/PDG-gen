public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        switch (scanner.next().charAt(0)) {
            case 'A':
                System.out.println('T');
                return;
            case 'C':
                System.out.println('G');
                return;
            case 'G':
                System.out.println('C');
                return;
            case 'T':
                System.out.println('A');
        }
    }
}