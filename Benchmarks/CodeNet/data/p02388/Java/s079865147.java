import java.io*;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, ans;
        x = Integer.ParseInt(br.readLine);
        ans = x * x * x;
        System.out.println(ans);
    }
}