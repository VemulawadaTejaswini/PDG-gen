import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            String tmp = String.valueOf(s.charAt(i));
            int number = (str.indexOf(tmp) + n);
            answer.append(str.substring(number, number + 1));
        }
        System.out.println(answer);
        sc.close();
    }
}
