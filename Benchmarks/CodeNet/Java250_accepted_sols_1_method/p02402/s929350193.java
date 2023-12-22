import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        long n = Long.parseLong(br.readLine());
        String[] input = br.readLine().split(" ");
        long m = Long.parseLong(input[0]);
        long mm = Long.parseLong(input[0]);
        long sum = 0;
        for(int x = 0 ; x < n ; x++){
        	int a = Integer.parseInt(input[x]);
        	m = Math.max(m, a);
        	mm = Math.min(mm, a);
        	sum = sum + a;
        }
        System.out.println(mm + " " + m + " " + sum);
    }
}