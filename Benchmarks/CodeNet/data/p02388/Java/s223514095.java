import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            int x = Integer.parseInt(br.readLine());
            System.out.println(x*x*x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}