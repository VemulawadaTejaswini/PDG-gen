import java.util.*;

class MathUtil {
	public static void swap(int[] obj, int a, int b) {
		int tmp = obj[a];
		obj[a] = obj[b];
		obj[b] = tmp;
	}
}

class Dice {
	int N=6;
	int ten[] = new int[N+1];

	public Dice(int[] tenkaizu) {
		for(int i=1;i<=N;i++) {
			this.ten[i] = tenkaizu[i-1];
		}
	}

	@Override
	public boolean equals(Object obj) {
		return this.toNumberStr().equals(((Dice)obj).toNumberStr());
	}

	@Override
	public int hashCode() {
		return (int)Long.parseLong(toNumberStr());
	}

	public int showDice(int number) {
		return ten[number];
	}

	public void printDice() {
	    for(int i=1;i<=N;i++) {
            System.out.print(ten[i] + "\t");
        }
        System.out.println("");
    }

	public void rotate(String meirei) {
		switch (meirei) {
			case "N":
				rotate(1, 2, 6, 5);
				break;
			case "S":
				rotate(5,6, 2, 1);
				break;
			case "E":
				rotate(4, 6, 3, 1);
				break;
			case "W":
				rotate(1, 3, 6, 4);
				break;
		}
	}

	public void rotate(int a, int b, int c, int d) {
		MathUtil.swap(ten, a, b);
		MathUtil.swap(ten, b, c);
		MathUtil.swap(ten, c, d);
	}

	public void rotate(int a, int b, int c) {
		MathUtil.swap(ten, a, b);
		MathUtil.swap(ten, b, c);
	}

	/**
	 * ????????????????????¢??????d?????????
	 * @param d
	 */
	public void topTo(int d) {
		for(int i=0;i<4;i++) {
			rotate("W");
			if(showDice(1) == d) break;
		}
		for(int i=0;i<4;i++) {
			rotate("N");
			if(showDice(1) == d) break;
		}
	}

	public int findRight(int frontD) {
		int[] pos = {4,2,3,5};
		for(int i=0;i<4;i++) {
			if(ten[pos[i]] == frontD) {
				return ten[pos[(i+1)%4]];
			}
		}
		return -1;
	}

	public String toNumberStr() {
		String str = "";
		for(int i=1;i<=N;i++) {
			str += ""+ten[i];
		}
		return str;
	}
}

class DiceUtil {
	static Set<String> diceSet;
	public static boolean isSame(Dice d1, Dice d2) {
		diceSet = new HashSet<>();
		return dfs(d1, d2);
	}

	public static boolean dfs(Dice d1, Dice d2) {
		int n = diceSet.size();
		if(diceSet.contains(d1)) return false;
		if(d1.equals(d2)) return true;
		diceSet.add(d1.toNumberStr());
		if(n == diceSet.size()) return false;
		for(int i=0;i<4;i++) {
			d1.rotate("N");
			if(dfs(d1, d2)) return true;
		}
		for(int i=0;i<4;i++) {
			d1.rotate("E");
			if(dfs(d1, d2)) return true;
		}
		return false;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		List<Dice> dices = new ArrayList<>();
		for(int k=0;k<n;k++) {
			String[] men_str = in.nextLine().split(" ");
			int[] men_int = new int[6];
			for (int i = 0; i < 6; i++) {
				men_int[i] = Integer.parseInt(men_str[i]);
			}
			Dice dice = new Dice(men_int);
			dices.add(dice);
		}
		boolean answer = true;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(DiceUtil.isSame(dices.get(i), dices.get(j))) {
					answer = false;
					break;
				}
			}
			if(!answer) break;
		}
		if(answer) System.out.println("Yes");
		else System.out.println("No");
	}
}