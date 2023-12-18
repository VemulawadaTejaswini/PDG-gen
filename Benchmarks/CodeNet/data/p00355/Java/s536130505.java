import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        boolean[] schedule = new boolean[1000]; // default false

        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            line = br.readLine().split(" ");
            int s = Integer.parseInt(line[0]);
            int e = Integer.parseInt(line[1]);
            for (int j = s; j < e; j++) {
                schedule[j] = true;
            }
        }

        boolean result = true;
        for (int i = a; i < b; i++) {
            if (schedule[i]) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
