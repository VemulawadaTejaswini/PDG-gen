import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		List<String> rows = new ArrayList<>();
		while (sc.hasNext()) {
			String a = sc.nextLine();
			if (!a.equals("")) {
				rows.add(a);
			}
		}
		sc.close();

		boolean a = true;

		for (int i = 0; i < h ; i++) {
			for (int k = 0 ; k < w ; k++) {
				if (rows.get(i).charAt(k) == '#') {
					if (i == 0) {
						if (k == 0) {
							if (rows.get(i).charAt(k+1) == '.' && rows.get(i+1).charAt(k) == '.') {
								a = false;
								break;
							}
						} else if (k == w-1) {
							if (rows.get(i).charAt(k-1) == '.' && rows.get(i+1).charAt(k) == '.') {
								a = false;
								break;
							}
						} else {
							if (rows.get(i).charAt(k+1) == '.' && rows.get(i+1).charAt(k) == '.'
									&& rows.get(i).charAt(k-1) == '.') {
								a = false;
								break;
							}
						}
					} else if (i == h-1) {
						if (k == 0) {
							if (rows.get(i).charAt(k+1) == '.' && rows.get(i-1).charAt(k) == '.') {
								a = false;
								break;
							}
						} else if (k == w-1) {
							if (rows.get(i).charAt(k-1) == '.' && rows.get(i-1).charAt(k) == '.') {
								a = false;
								break;
							}
						} else {
							if (rows.get(i).charAt(k+1) == '.' && rows.get(i-1).charAt(k) == '.'
									&& rows.get(i).charAt(k-1) == '.') {
								a = false;
								break;
							}
						}
					} else {
						if (k == 0) {
							if (rows.get(i).charAt(k+1) == '.' && rows.get(i+1).charAt(k) == '.'
									&& rows.get(i-1).charAt(k) == '.') {
								a = false;
								break;
							}
						} else if (k == w-1) {
							if (rows.get(i).charAt(k-1) == '.' && rows.get(i+1).charAt(k) == '.'
									&& rows.get(i-1).charAt(k) == '.') {
								a = false;
								break;
							}
						} else {
							if (rows.get(i).charAt(k+1) == '.' && rows.get(i+1).charAt(k) == '.'
									&& rows.get(i).charAt(k-1) == '.' && rows.get(i-1).charAt(k) == '.') {
								a = false;
								break;
							}
						}
					}
				}
			}
		}

		if (a) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}