import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		ArrayList<Integer> vector  = new ArrayList<>();

		int loop = in.nextInt();
		for(int i = 0; i < loop; i++) {
			int odr = Integer.parseInt(in.next());
			switch(odr) {
				case 0:
					vector.add(Integer.parseInt(in.next()));
					break;

				case 1:
					out.println(vector.get(Integer.parseInt(in.next())));
					break;

				case 2:
					vector.remove(vector.size()-1);
					break;
			}
		}
		out.flush();
		in.close();
	}

}

