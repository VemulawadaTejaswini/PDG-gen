import java.io.*;
import java.util.*;

class Helper {
	ArrayList<Integer> elems;
	public Helper(ArrayList<Integer> elements) {
		this.elems = elements;
	}
	public void makeCanList(ArrayList<Integer> cans) {
		for (int ei = 0; ei < elems.size(); ++ei) {
			int elem = elems.get(ei);
			int size = cans.size();
			for (int li = 0; li < size; ++li) {
				int can = cans.get(li);
				cans.add(can + elem);
			}
			cans.add(elem);
		}
	}
}

public class Main {
	ArrayList<Integer> A;
	ArrayList<Integer> M;
	public static void main(String[] args) {
		StringBuilder ans = new StringBuilder();
		Main m = new Main();
		m.input();
		Helper helper = new Helper(m.A);
		ArrayList<Integer> cans = new ArrayList<>();
		helper.makeCanList(cans);
		for (int i = 0; i < m.M.size(); ++i) {
			int x = m.M.get(i);
			boolean has = cans.contains(x);
			if (has) {
				ans.append("yes" + "\n");
			} else {
				ans.append("no" + "\n");
			}
		}
		ans.deleteCharAt(ans.length() - 1);
		System.out.println(ans.toString());
	}
	public void input() {
		try {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        int n = Integer.parseInt(reader.readLine());
                        A = new ArrayList<>();
                        StringTokenizer stA = new StringTokenizer(reader.readLine());
                        while (stA.hasMoreTokens())
                                A.add(Integer.parseInt(stA.nextToken()));
                        int q = Integer.parseInt(reader.readLine());
                        M = new ArrayList<>();
                        StringTokenizer stM = new StringTokenizer(reader.readLine());
                        while (stM.hasMoreTokens())
                                M.add(Integer.parseInt(stM.nextToken()));
                } catch (Exception e) {
                        e.printStackTrace();
                }
	}
}
