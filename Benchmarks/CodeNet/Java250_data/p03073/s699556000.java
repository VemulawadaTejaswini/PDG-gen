import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int count = 0;
        String[] sar = s.split("");
        for (int i = 1; i < s.length(); i++) {
            if (sar[i-1].equals(sar[i])) {
                count++;
                if (sar[i].equals("0")) {
                    sar[i] = "1";
                } else {
                    sar[i] = "0";
                }
            }
        }
        System.out.println(count);
    }

}
