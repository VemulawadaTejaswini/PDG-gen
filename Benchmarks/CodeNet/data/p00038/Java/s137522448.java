import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while (sc.hasNext()) {
			String str = sc.next();
			String[] c = str.split(",");
			int[] vals=new int[5];
			for(int i=0;i<5;i++){
				vals[i]=Integer.parseInt(c[i]);
			}
			Arrays.sort(vals);

			Integer[] match = new Integer[5];
			Arrays.fill(match,0);
			boolean isStreight = true;
			int prev = -1;
			for (int i = 0, j = -1; i < 5; i++) {
				if (prev != vals[i])
					j++;
				if (i > 0 && (prev + 1 != vals[i]) ){
						isStreight = false;
				}
				prev = vals[i];
				match[j]++;
			}

			if(Arrays.equals(vals,new int[]{1,10,11,12,13})){
				isStreight=true;
			}

			Arrays.sort(match, Collections.reverseOrder());

			switch (match[0]) {
			case 4:
				ln("four card");
				break;
			case 3:
				if (match[1] == 2) {
					ln("full house");
					break;
				}
				if (isStreight) {
					ln("straight");
					break;
				}
				ln("three card");
				break;
			case 2:
				if (isStreight) {
					ln("straight");
					break;
				}
				switch (match[1]) {
				case 2:
					ln("two pair");
					break;
				default:
					ln("one pair");
					break;
				}
				break;
			default:
				if (isStreight) {
					ln("straight");
					break;
				}
				ln("null");
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}