import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            boolean isNotAll9 = false;
            for (int i = 1; i < line.length(); ++i) {
                if (line.charAt(i) != '9') {
                    isNotAll9 = true;
                    break;
                }
            }
            int ret = line.charAt(0) - '0' + 9 * (line.length() - 1);
            if (isNotAll9) {
                --ret;
            }
            System.out.println(ret);
        }
    }
}