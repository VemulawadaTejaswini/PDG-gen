import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Boolean> blue = new ArrayList<>();
		
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			blue.add(false);
			if (str.charAt(i) == '1') {
				blue.set(i, true);
			}
		}
		
		int count = 0;
		
		while (true) {
			int index1 = -1;
			int index2 = -1;
			
			int n = blue.size() / 2;
			
			for (int i = n; i < blue.size() - 1; i++) {
				if (blue.get(i) != blue.get(i + 1)) {
					index1 = i;
					break;
				}
			}
			
			for (int i = n - 1; i >= 0; i--) {
				if (blue.get(i) != blue.get(i + 1)) {
					index2 = i;
					break;
				}
			}
			
			int index = -1;
			
			if (index1 < 0){
				index = index2;
			} else if (index2 < 0) {
				index = index1;
			} else {
				if (index1 - n < n - index2) {
					index = index1;
				} else {
					index = index2;
				}
			}
			
			if (index < 0) {
				break;
			} else {
				for (int i = 0; i < 2; i++) {
					blue.remove(index);
				}
			}
			
			count += 2;
		}
		
		System.out.println(count);
	}
}
