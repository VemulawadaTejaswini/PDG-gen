import java.io.*;

class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int x, y;
		while (true) {
			x = Integer.parseInt(scan.readLine());
			y = Integer.parseInt(scan.readLine());
			if (x == 0 & y == 0)
				break;
			if(x < y)
			System.out.println(x + " " + y);
			else
			System.out.println(y + " " + x);
		}
	}
}