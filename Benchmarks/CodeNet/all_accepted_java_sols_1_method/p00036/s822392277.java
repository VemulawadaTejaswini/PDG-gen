import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int offsetX = 0;
            int offsetY = 0;
            int sum = 0;
            for (int i = 0; i < 8; i++) {
                String text = sc.next();
                for (int j = 0; j < 8; j++) {
                    if (text.charAt(j) == '1') {
                        if (sum == 0) {
                            offsetX = j;
                            offsetY = i;
                            sum++;
                        } else {
                            sum += i * 4 - offsetY * 4 + j - offsetX + 1;
                        }
                    }
                }
            }
            char answer = 0;
            switch (sum) {
            case 14:
                answer = 'A';
                break;
            case 28:
                answer = 'B';
                break;
            case 10:
                answer = 'C';
                break;
            case 18:
                answer = 'D';
                break;
            case 16:
                answer = 'E';
                break;
            case 22:
                answer = 'F';
                break;
            case 12:
                answer = 'G';
                break;
            }
            System.out.println(answer);
        }
    }
}
