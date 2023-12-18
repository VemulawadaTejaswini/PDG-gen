import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        
        int n = Integer.valueOf(br.readLine());
        String input[] = br.readLine().split(" ", 0);
        
        int min = 1000000;
        int max = -1000000;
        long sum = 0;
        int num = 0;
        for (String s : input) {
            num = Integer.valueOf(s);
            sum += num;
            
            if (num < min) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        
        System.out.println(min + " " + max + " " + sum);
    }
}
