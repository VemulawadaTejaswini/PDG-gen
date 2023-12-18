import java.util.*;
public class Main {
	boolean isSequenceNumber(int[] num) {
		boolean flag = true;
		for(int r = 1; r < num.length; r++) {
			if(num[r] - num[r - 1] != 1) {
				flag = false;
				if(r % 3 == 0) {
					flag = true;
				}
				if(!flag) return(false);
			}
		}
		return(flag);
	}

	boolean isMatchNumber(int[] num) {
		boolean flag = true;
		for(int r = 1; r < num.length; r++) {
			if(num[r] - num[r - 1] != 0) {
				flag = false;
				if(r % 3 == 0) {
					flag = true;
				}
				if(!flag) return(false);
			}
		}
		return(flag);
	}

	boolean Check(int num) {
		return(num == 0);
	}

	void doIt() {
		Scanner stdIn = new Scanner(System.in);

		int limit = stdIn.nextInt();
		for(int r = 0; r < limit; r++) {
			int[][] num = new int[3][3];
			String[][] str = new String[3][3];
			int[] counter = new int[3];
			for(int c = 0; c < num.length; c++) {
				for(int k = 0; k < num[c].length; k++) {
					num[c][k] = stdIn.nextInt();
				}
			}
			for(int c = 0; c < str.length; c++) {
				for(int k = 0; k < str[c].length; k++) {
					str[c][k] = stdIn.next();
					switch(str[c][k].charAt(0)) {
					case 'R': counter[0]++; break;
					case 'G': counter[1]++; break;
					case 'B': counter[2]++; break;
					}
				}
			}
			boolean flag = true;
			if(!Check(counter[0] % 3) || !Check(counter[1] % 3) || !Check(counter[2] % 3)) flag = false;
			if(flag) {
				String temp = "RGB";
				for(int i = 0; i < 3; i++) {
					ArrayList<Integer> list = new ArrayList<Integer>();
					for(int c = 0; c < num.length; c++) {
						for(int k = 0; k < num[c].length; k++) {
							if(str[c][k].charAt(0) == temp.charAt(i)) list.add(num[c][k]);
						}
					}
					Collections.sort(list);
					if(list.size() != 0) {
						int[] number = new int[list.size()];
						for(int c = 0; c < list.size(); c++) {
							number[c] = list.get(c);
						}
						if(!((isMatchNumber(number) || (isSequenceNumber(number))))) flag = false;
					}
				}
			}
			System.out.println((flag) ? 1 : 0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}