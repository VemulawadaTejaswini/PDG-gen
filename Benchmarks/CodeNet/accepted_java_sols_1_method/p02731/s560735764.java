import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        double thirds = l/3.0;
        double res = thirds*thirds*thirds;
        System.out.println(res);
    }
}
