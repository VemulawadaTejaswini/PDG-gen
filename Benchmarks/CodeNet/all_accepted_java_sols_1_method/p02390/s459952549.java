import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sec=Integer.parseInt(reader.readLine());
        int h=sec/3600;
        int m=(sec%3600)/60;
        int s=(sec%60);
        System.out.println(Integer.toString(h) + ":" + Integer.toString(m) +":" +Integer.toString(s));
	}
}