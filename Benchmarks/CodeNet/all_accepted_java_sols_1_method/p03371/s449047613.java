import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] get = br.readLine().split(" ");
		int a = Integer.parseInt(get[0]);
		int b = Integer.parseInt(get[1]);
		int c = Integer.parseInt(get[2]);
		int x = Integer.parseInt(get[3]);
		int y = Integer.parseInt(get[4]);

		int money = (int)Math.pow(10, 10);

		money = Math.min((a*x) + (b*y),Math.max(x, y)*2*c);
		int add = 0;

		if(x>y)add = (y*2*c) + ((x-y)*a);
		else add = (x*2*c) + ((y-x)*b);

		money = Math.min(money,add);

		System.out.println(money);
	}

}
