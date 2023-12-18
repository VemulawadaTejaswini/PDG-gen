import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int N = scanner.nextInt();
		List<Integer> nums = new ArrayList<Integer>();
		List<Integer> data = new ArrayList<Integer>();
		boolean b = true;

		for(int i = 0; i < N;i++) {
			nums.add(scanner.nextInt());
			if(nums.get(i) == X)b = false;
		}
		if(b) {
			System.out.println(X);
			System.exit(0);
		}
		for(int i = 0;i<=101;i++) {
			data.add(i);
		}
		for(int i = 0; i < nums.size();i++) {
			for(int j = 0; j<data.size();j++) {
				if(data.get(j) != X && nums.get(i) == data.get(j)) {
					data.remove(j);
				}
			}
		}
		int Xindex = data.indexOf(X);
		if(X-data.get(Xindex-1)<=data.get(Xindex+1)-X) {
			System.out.println(data.get(Xindex-1));
		}else {
			System.out.println(data.get(Xindex+1));
		}
		scanner.close();
	}
}
