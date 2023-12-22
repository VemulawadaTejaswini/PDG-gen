import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        // 사전순 빠른게 승 3점
        // 무승부 1점
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data;
        int rep, a = 0, b = 0;
        try {
            rep = Integer.parseInt(br.readLine());
            while (rep-- > 0) {
                data = br.readLine().split(" ");
                if (data[0].compareTo(data[1]) == 0) {
                    a++;
                    b++;
                } else if (data[0].compareTo(data[1]) >= 1)
                    a += 3;
                else
                    b += 3;
            }
            System.out.printf("%d %d\n", a, b);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
