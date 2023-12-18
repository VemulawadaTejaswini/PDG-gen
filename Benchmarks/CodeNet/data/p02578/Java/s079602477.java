import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        int size = Integer.parseInt(in.readLine());
        String[] str = in.readLine().split(" ");
        int num1 = 0;
        int num2 = 0;
        int step = 0;
        int res = 0;

        for(int i=0; i < size-1; i++) {
        	num1 = Integer.parseInt(str[i]) + step;
        	num2 = Integer.parseInt(str[i+1]);

        	if(num1 > num2) {
        		step = num1 - num2;
        		res += step;
        	}else {
        		step = 0;
        	}
        }

        System.out.println(res);

    }
}