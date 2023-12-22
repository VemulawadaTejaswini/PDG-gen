import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        String t = sc.next();
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append(s_array[i]);
            answer.append(t_array[i]);
        }
        System.out.println(answer);
        sc.close();
    }
}
