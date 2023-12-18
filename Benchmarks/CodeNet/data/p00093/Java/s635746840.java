import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		ArrayList<String> ds = new ArrayList<String>();

		try {
			while ((s = br.readLine()) != null) {
				if (s.equals("0 0"))
					break;
				ds.add(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < ds.size(); i++) {
			int year1 = Integer.parseInt((ds.get(i).split(" ")[0]));
			int year2 = Integer.parseInt((ds.get(i).split(" ")[1]));
			int count = 0;
			for (int j = year1; j <= year2; j++) {
				if (isLeep(j)) {
					System.out.println(j);
					count++;
				}
			}
			if (count == 0)
				System.out.println("N/A");
			if (i != ds.size() - 1)
				System.out.println();
		}
	}

	public static boolean isLeep(int year) {

		boolean r = false;

		if (year % 4 == 0)
			r = true;

		if (year % 100 == 0)
			r = false;

		if (year % 400 == 0)
			r = true;

		return r;
	}

}