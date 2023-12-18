import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long num = 0;
        int cnt = 1;
        long[] array26 = new long[10000000];
        while (num < N){
            num = num + (long) Math.pow(26, cnt);
            array26[cnt] = num;
            cnt++;
//            System.out.println(num+" "+cnt);
        }

        long digit_num = 0;
        digit_num = N - array26[cnt - 2] - 1;
//        System.out.println("digit_num "+digit_num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt - 1; i++){
            sb.append(String.valueOf((char) (digit_num % 26 + 97)));
//            sb.append(" ");
            digit_num = digit_num / 26;
        }
        StringBuffer reverseString = new StringBuffer(sb.toString());
//        for (int i = 0; i < reverseString.length(); i++){
//            reverseString.append(String.valueOf(sb.toString().charAt(reverseString.length() - i - 1)));
//        }
        System.out.println(reverseString.reverse().toString());
//        System.out.println(reverseString.toString());



    }
}