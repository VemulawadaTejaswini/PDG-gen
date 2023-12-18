import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int s = Integer.parseInt(br.readLine());
	int sec = s % 60;
	int t = s / 60;
	int min = t % 60;
	int hour = t / 60;

	System.out.println(hour + ":" + min + ":" + sec);
    }

}