import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scan.nextInt();
        int x = 1;
        int y = 0;
        if (n >= 3 && n <= 10000) {
            for (int count = 0;count < n; count++) {
                y = x / 10;
                if (x % 3 == 0){
                    sb.append(" ")
                        .append(x);
                } else {
                    y = x;
                    while(y != 0) {
                        if (y % 10 == 3) {
                            sb.append(" ")
                                .append(x);
                            break;
                        }
                        y /= 10;
                    }
                }
                x++;
            }
            System.out.println(sb);
        }
    }
}