import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int N = scanner.nextInt();
		List<Integer> nums = new ArrayList<Integer>();
		boolean b = true;

		for(int i = 0; i < N;i++) {
			nums.add(scanner.nextInt());
			if(nums.get(i) == X)b = false;
		}

		if(b) {
			System.out.println(X);
			System.exit(0);
		}

		Collections.sort(nums);
		int Xindex = nums.indexOf(X);

		for(int i = 1; i < Xindex;i++) {
			if(nums.get(Xindex-i)!=X-i){
				System.out.println(X-i);
				System.exit(0);
			}
		}
		for(int i = 1; i<nums.size()-Xindex;i++) {
			if(nums.get(Xindex+i)!=X+i) {
				System.out.println(X+i);
				System.exit(0);
			}
		}
		scanner.close();
	}
}