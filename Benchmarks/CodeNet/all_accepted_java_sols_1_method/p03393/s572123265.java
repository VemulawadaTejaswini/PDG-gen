import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.length() != 26) {
                for (char c = 'a'; c <= 'z'; ++c) {
                    boolean notFound = true;
                    for (int i = 0; i < line.length(); ++i) {
                        if (line.charAt(i) == c) {
                            notFound = false;
                            break;
                        }
                    }
                    if (notFound) {
                        System.out.println(line + c);
                        break;
                    }
                }
            } else if (line.equals("zyxwvutsrqponmlkjihgfedcba")) {
                System.out.println(-1);
            } else {
                for (int i = 24; i >= 0; --i) {
                    for (char c = (char)(line.charAt(i) + 1); c <= 'z'; ++c) {
                        boolean notFound = true;
                        for (int j = 0; j <= i; ++j) {
                            if (line.charAt(j) == c) {
                                notFound = false;
                                break;
                            }
                        }
                        if (notFound) {
                            System.out.println(line.substring(0, i) + c);
                            return;
                        }
                    }
                }
            }
        }
    }
}