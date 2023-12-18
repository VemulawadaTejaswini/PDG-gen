import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int mm = Integer.parseInt(input[0]);
        int sum = 0;
        for(int x = 0 ; x < n ; x++){
        	int a = Integer.parseInt(input[x]);
        	m = Math.max(m, a);
        	mm = Math.min(mm, a);
        	sum = sum + a;
        }
        System.out.println(mm + " " + m + " " + sum);
    }
}