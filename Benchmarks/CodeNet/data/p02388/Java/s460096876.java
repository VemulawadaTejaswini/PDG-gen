import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = reader.nextInt();
        System.out.println(n * n * n);
    }
}