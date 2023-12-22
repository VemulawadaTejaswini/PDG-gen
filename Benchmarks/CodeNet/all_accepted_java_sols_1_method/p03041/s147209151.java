import java.util.Scanner;

public class Main {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int N = Integer.parseInt(abt[0]);
        int K = Integer.parseInt(abt[1]);

        String S = sc.nextLine();
        char[] Sarr = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i == K - 1) {
                String s = String.valueOf(Sarr[i]);
                sb.append(s.toLowerCase());
            } else {
                sb.append(Sarr[i]);
            }
        }

        System.out.println(sb.toString());
    }

}
