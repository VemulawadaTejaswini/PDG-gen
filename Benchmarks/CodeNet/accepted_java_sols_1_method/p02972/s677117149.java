import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();

		List<Boolean> a = new ArrayList<>();
		List<Boolean> result = new ArrayList<>();

		for(int i = 0;i < l;i++) {
			a.add(sc.nextInt() == 1 ? true : false);
			result.add(false);
		}

		for(int i = l;i > 0;i--) {
			int loopNum = l / i;
			boolean isEven = false;

			for(int j = loopNum * i; j > i;j-=i) {
				if(result.get(j - 1)) {
					isEven = isEven ? false : true;
				}
			}

			result.set(i - 1,isEven ^ a.get(i - 1));
		}

		int count = 0;
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i < l;i++) {
			if(result.get(i)) {
				count++;
				sb.append((i + 1) + " ");
			}
		}

		if(sb.length() > 0) {
			sb.setLength(sb.length() - 1);
			System.out.println(count);
			System.out.println(sb.toString());
		}else {
			System.out.println("0");
		}
	}
}
