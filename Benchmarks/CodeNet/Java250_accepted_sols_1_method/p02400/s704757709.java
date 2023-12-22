import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		String str[];
        double r;
        double area,circumference;
        String a,c;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        r = Double.parseDouble(str[0]);

        area = r * r * Math.PI;
        circumference = (r + r) * Math.PI;
        a = String.format("%.6f", area);
        c = String.format("%.6f", circumference);
        System.out.println(a + " " + c);
	}
}