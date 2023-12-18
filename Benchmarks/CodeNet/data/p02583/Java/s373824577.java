import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] data = in.readLine().split(" ");
        int[] xs = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            xs[i] = Integer.parseInt(data[i]);
        }
        int ans = 0;
        for (int i = 0; i < xs.length; i++) {
            for (int j = i + 1; j < xs.length; j++) {
                for (int k = j + 1; k < xs.length; k++) {
                    if (xs[i] == xs[j] || xs[i] == xs[k] || xs[j] == xs[k]) continue;
                    if (isTriangle(xs[i], xs[j], xs[k])) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
