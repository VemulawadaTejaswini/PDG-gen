import java.io.*;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            int ai = Integer.parseInt(line[i]);
            if(ai < min) min = ai;
            if(max < ai) max = ai;
            sum += ai;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}