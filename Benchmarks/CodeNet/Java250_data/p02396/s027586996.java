import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String x;
        int i = 1;
        while(true){
        	x = br.readLine();
        	if (x.equals("0"))
        		return;
        	System.out.println("Case " + i + ": " + x);
        	i++;
        }
    }
}