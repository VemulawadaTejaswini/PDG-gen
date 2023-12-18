import java.io.IOException;

public class Main{
    public static void main(String[] a) throws IOException {
		int s1,s2;
		String[] stock = new String[3];
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		String Input = in.readLine();
		stock = Input.split(" ");
		s1 = Integer.parseInt(stock[0]);
		s2 = Integer.parseInt(stock[1]);
		stock[0] = String.valueOf(s1 + s2);
		System.out.println(stock[0].length());
	
    }
}