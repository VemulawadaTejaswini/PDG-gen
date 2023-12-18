import java.io.*;// 从这行开始复制，这是第一行
import java.util.*;

public class Main {

    /**
     * TODO 提交的时候一定要设置为 true
     */
    private boolean submitFlag = true;

    private void solve(String s) {
        int ans = 1;

        // 前缀和。
        int[][] sum = new int[3][s.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            sum[0][i] = s.charAt(i - 1) == '0' ? sum[0][i - 1] + 1 : sum[0][i - 1];
            sum[1][i] = s.charAt(i - 1) == '1' ? sum[1][i - 1] + 1 : sum[1][i - 1];
            sum[2][i] = s.charAt(i - 1) == '?' ? sum[2][i - 1] + 1 : sum[2][i - 1];
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int r = i; r <= s.length(); r++) {
                int sum0 = sum[0][r] - sum[0][r - i];
                int sum1 = sum[1][r] - sum[1][r - i];
                int sumWhat = sum[2][r] - sum[2][r - i];
                int max = Math.max(sum0, sum1);
                int min = Math.min(sum0, sum1);
                ans = Math.max(max - min - sumWhat, ans);
            }
        }


        System.out.println(ans);
    }


    private void run() throws IOException {
        setReader();

        //TODO 从这里开始读入题目输入
        String s = next();
        solve(s);
    }


//    main以及输入输出========================================================================

    public static void main(String[] args) throws IOException {
        Main solution = new Main();
        solution.run();
        solution.reader.close();
    }

    /**
     * TODO 存档时，改一下moduleName
     */
    String moduleName = "atcoder-race";

    /**
     * 注意不同题目这里路径要设一下
     *
     * @throws IOException
     */
    private void setReader() throws IOException {
        if (submitFlag) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        } else {
            String projectPath = System.getProperty("user.dir");
            String modulePath = projectPath + "/" + moduleName + "/src/main/java/";
            String className = this.getClass().getPackage().getName().replace(".", "\\");
            reader = new BufferedReader(new FileReader(modulePath + className + "\\input.txt"));
        }
    }

    private BufferedReader reader;
    private StringTokenizer tokenizer;

    private int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    private long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    private double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    private String next() throws IOException {
        return nextToken();
    }

    private String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }
}
