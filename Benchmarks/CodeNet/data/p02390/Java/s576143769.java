import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int input = Integer.parseInt(br.readLine());
	
	int h = input/3600;
	int ms = input%3600;
	int m = ms/60;
	int s = ms%60;

	System.out.println(h + ":" + m + ":" + s);
    }
}