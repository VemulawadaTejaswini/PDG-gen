import java.io.*

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        
        long sum = 0;
        int a = 0;
        int max = -1000000;
        int min = 1000000;

        for (int i =0; i < n; i++) {
            a = Integer.parseInt(str[i]);
            if (a > max)max = a;
            if (a < min)min = a;
            sum += a;
        }
        System.out.println(min + " " + max + " " + sum);
    }
}