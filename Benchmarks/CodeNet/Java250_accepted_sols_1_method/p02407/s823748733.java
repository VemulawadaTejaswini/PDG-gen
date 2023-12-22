import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        for (int i = n - 1; i >= 0; i--) {
            sb.append(str[i] + " ");
        }
        int a = sb.length();
        sb.deleteCharAt(a-1);
        System.out.println(sb);
    }
}