import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String[] li1 = line1.split(" ");
		int n = Integer.parseInt(li1[0]);
		int q = Integer.parseInt(li1[1]);

		ArrayList<String> st = new ArrayList<String>();
		ArrayList<Integer> in = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			String kari1 = sc.nextLine();
			String[] kari2 = kari1.split(" ");
			
			st.add(kari2[0]);
			in.add(Integer.parseInt(kari2[1]));
		}
		
		int time = 0;
		
		while (in.size() > 0) {
			if (in.get(0) <= q) {
				time += in.get(0);
				System.out.println(st.get(0) + " " + time);
				in.remove(0);
				st.remove(0);
			} else {
				time += q;
				in.add(in.get(0) - q);
				st.add(st.get(0));
				in.remove(0);
				st.remove(0);

			}
		}

	}

}