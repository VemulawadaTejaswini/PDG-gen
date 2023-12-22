import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        int[] input_ary = new int[4];
        for (int i = 0; i < 4; i++) {
            input_ary[i] = input.charAt(i) - '0';
        }

        String[] calc_ary = new String[8];
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    sb.append(i);
                    sb.append(j);
                    sb.append(k);
                    calc_ary[cnt] = sb.toString();
                    sb = new StringBuilder();
                    cnt++;
                }
            }
        }

        char target = 0;
        int sum = 0;
        for (String elm : calc_ary) {
            sum = input_ary[0];
            for (int i = 0; i < elm.length(); i++) {
                target = elm.charAt(i);
                switch (target) {
                case '0':
                    sum -= input_ary[i + 1];
                    break;
                case '1':
                    sum += input_ary[i + 1];
                    break;
                }
            }
            if (sum == 7) {
                sb.append(input_ary[0]);
                sb.append(elm.charAt(0) == '0' ? "-" : "+");
                sb.append(input_ary[1]);
                sb.append(elm.charAt(1) == '0' ? "-" : "+");
                sb.append(input_ary[2]);
                sb.append(elm.charAt(2) == '0' ? "-" : "+");
                sb.append(input_ary[3]);
                sb.append("=7");
                break;
            }
            sum = 0;
        }
        System.out.println(sb.toString());
    }
}