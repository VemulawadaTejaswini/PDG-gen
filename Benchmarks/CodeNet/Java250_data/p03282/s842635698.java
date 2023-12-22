import java.io.*;

class Main {
    static char calc(String str, int index) {
        char answer = str.charAt(0);

        if (str.charAt(0) == '1') {
            int lastIndex = 0;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    lastIndex = i;
                } else {
                    break;
                }
            }

            if (index - 1 <= lastIndex) {
                answer = '1';
            } else {
                answer = str.charAt(lastIndex + 1);
            }
        }

        return answer;
    }

    public static void main(String args[]) throws IOException {
        String S;
        int K;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        String k_s = br.readLine();
        K = k_s.length() > 3 ? 101 : Integer.valueOf(k_s);

        System.out.println(calc(S, K));
    }
}
