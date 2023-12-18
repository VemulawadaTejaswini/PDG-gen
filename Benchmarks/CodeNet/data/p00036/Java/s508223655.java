import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		boolean first = true;
		while(in.hasNext()) {
			if(!first) {
				in.nextLine(); // ???????????¨??????
			}

			List<String> map = new ArrayList<>();
			map.add("          "); //????????¨
			for (int i = 0; i < 8; i++) {
				String str = in.nextLine();
				str = " " + str + " ";
				map.add(str);
			}
			map.add("          "); //????????¨
			solve(map);
			first = false;
		}
	}

	public static void solve(List<String> map) {
		List<List<String>> pat = new ArrayList<>();
		pat.add(
				Arrays.asList("11",
						          "11"));
		pat.add(
				Arrays.asList("1","1","1","1")
		);
		pat.add(
				Arrays.asList("1111")
		);
		pat.add(
				Arrays.asList("01",
						"11",
						"10")
		);
		pat.add(
				Arrays.asList("110",
						"011")
		);
		pat.add(
				Arrays.asList("10",
						"11",
						"01")
		);
		pat.add(
				Arrays.asList("011",
						"110")
		);

		int ans = 0;
		mainloop:
		for(int i=0;i<map.size();i++) {
			for(int j=0;j<map.get(0).length();j++) {
				// 1?????¢???
				if(map.get(i).charAt(j) == '1') {
					// ?????????????????£??????D???G
					if(map.get(i+1).charAt(j-1) == '1') {
						if(check(map, i, j-1, pat.get(3))) {
							ans = 3; break mainloop;
						}
						ans = 4; break mainloop;
					} else {
						for(int k=0;k<pat.size();k++) {
							if(check(map, i, j, pat.get(k))) {
								ans = k; break mainloop;
							}
						}
					}
					break mainloop;
				}
			}
		}
		System.out.println((char)(ans + 'A'));
	}

	public static boolean check(List<String> map, int i, int j, List<String> pat) {
		for(int k=0;k<pat.size();k++) {
			for(int l=0;l<pat.get(k).length();l++) {
				if(map.get(i+k).charAt(j+l) != pat.get(k).charAt(l)) return false;
			}
		}
		return true;
	}
}