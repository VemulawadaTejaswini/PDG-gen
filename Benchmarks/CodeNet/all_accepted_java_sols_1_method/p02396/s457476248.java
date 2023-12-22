import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, i = 1;
        while (true) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) break;
            System.out.println("Case "+i+": "+num);
            i++;
        }
    }
}