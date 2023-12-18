import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);

        long count = 0;
        for (int c = 1; c < n; c++) {
            int ab = (n - c);
            if (ab < 10) {
                switch (ab) {
                    case 1:
                        count++;
                        break;
                    case 2:
                        count += 2;
                        break;
                    case 3:
                        count += 2;
                        break;
                    case 4:
                        count += 3;
                        break;
                    case 5:
                        count += 2;
                        break;
                    case 6:
                        count += 4;
                        break;
                    case 7:
                        count += 2;
                        break;
                    case 8:
                        count += 4;
                        break;
                    case 9:
                        count += 3;
                        break;
                }
                continue;
            }

            int rootab = (int)Math.sqrt(ab) + 1;
            for (int i = 1; i < rootab; i++) {
                if ((ab / i) * i == ab) {
                    if (ab / i != i) {
                        count += 2;
                    } else {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

}