import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int a=0, b=0, o=0, ab=0;
		while((input = br.readLine()) != null) {
			if(input.isEmpty()) break;
			String[] split = input.split(",");
			if(split[1].equals("A")) a++;
			else if(split[1].equals("B")) b++;
			else if(split[1].equals("O")) o++;
			else if(split[1].equals("AB")) ab++;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);
	}
}