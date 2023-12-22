import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        int count = 0;
        while (true) {
            boolean key = false;
            a : for (int i = 0; i < 10; i++) {
                int num = N*i+res;
                if (num%10 == 7) {
                    count++;
                    String s = Integer.toString(num);
                    for (char c : s.toCharArray()) {
                        if (c != '7') {
                            res = num/10;
                            key = true;
                            break a;
                        }
                    }
                    count += s.length();
                    System.out.println(count-1);
                    return;
                } else {
                    continue;
                }
            }
            if (!key) {
                System.out.println(-1);
                return;
            }
        }

    }
}