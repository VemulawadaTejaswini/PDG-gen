import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Boolean A=true, B=false, C=false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while((input = br.readLine()) != null) {
			if(input.isEmpty()) break;
			String[] split = input.split(",");
			if(split[0] == "A" || split[1] == "A") {
				if(split[0] == "B" || split[1] == "B") change(A, B);
				else if(split[0] == "C" || split[1] == "C") change(A, C);
			}
			else change(B, C);
		}
		if(A) System.out.println("A");
		else if(B) System.out.println("B");
		else if(C) System.out.println("C");
		
	}
	public static void change(boolean x, boolean y) {
		boolean tmp;
		tmp = x;
		x = y;
		y = tmp;
	}
}