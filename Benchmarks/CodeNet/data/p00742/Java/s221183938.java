import java.util.*;


public class Main {
	
	public static int getFigure(int[] chars) {
		int figure = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != 0) figure++;
		}
		return figure;
	}
	
	public static int convert(char[] word, int[] comb, int[] char2digit) {
		int n = 0;
		int len = word.length;
		for (int i = 0; i < len; i++) {
			int j = char2digit[word[i] - 'A'] - 1;
			if (len > 1 && i == 0 && comb[j] == 0) {
				throw new IllegalStateException();
			}
			n += comb[j] * Math.pow(10, len - 1 - i);
		}
		return n;
	}
	
	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static boolean nextCombination(int[] comb, int n) {
		int i;
		for (i = n - 1; i > 0 && comb[i - 1] >= comb[i]; i--);
		if (i == 0) {
			return false;
		}
		
		int j;
		for (j = n - 1; j > i && comb[i - 1] >= comb[j]; j--);
		swap(comb, i - 1, j);
		
		for (int k = 0; k <= (n - 1 - i) / 2; k++) {
			swap(comb, i + k, n - 1 - k);
		}
		return true;
	}
	
	// taken from うんこ.txt
	/**
	 * pの次に大きな順列を得るstatic関数
	 * @param p	目的の順列
	 * @return	与えられた順列が最大ならfalse、でなければtrue
	 */
	public static boolean nextPermutation(int[] p) {
		// TODO: 次に大きな順列を求める
		// 順列を右から左に見ていき、はじめて小さくなった要素が交換すべき要素
		for(int i=p.length-2; 0 <= i; i--) {
			if(p[i] < p[i+1]) {
				// 見つけた要素の右で、その要素の次に大きな要素を探し、それと交換
				int r = i+1; // なんでもいいから初期値が欲しかった
				for(int j=i + 1; j < p.length; j++) {
					if(p[i] < p[j] && p[j] < p[r])
						r = j;
				}
				swap(p, r, i);
				// 最初に見つけた要素の右側を反転させる。（ことによって辞書順で最初のものになる）
				int jm = (p.length - (i+1)) / 2;
				for(int j=0; j < jm; j++) {
					int a = p.length - 1 - j;
					int b = i+1 + j;
					swap(p, a, b);
				}
				return true;
			}
		}
		return false;
	}
	
	public static int solve(char[][] words, int[] char2digit, int[] ignoreChar) {
		int count = 0;
		int figure = getFigure(char2digit);
		
		int[] num = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] c = new int[10];
		// initialize combination
		for (int i = 0; i < c.length; i++) {
			if (i >= figure) {
				c[i] = 1;
			} else {
				c[i] = 0;
			}
		}
		
		do {
			// combination
			int[] comb = new int[figure];
			int n = 0;
			for (int i = 0; i < c.length; i++) {
				if (c[i] == 0) {
					comb[n++] = num[i];
				}
			}
			
			int len = words.length;
			do {
				try {
					int sum = 0;
					for (int k = 0; k < len - 1; k++) {
						sum += convert(words[k], comb, char2digit);
					}
					int answer = convert(words[len - 1], comb, char2digit);
					if (sum == answer) {
						count++;
					}
				} catch (IllegalStateException e) {}
			} while (nextPermutation(comb));
		} while (nextCombination(c, 10));
		
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			} else {
				char[][] words = new char[n][];
				int[] char2digit = new int[26]; // A..Z
				int[] ignoreChar = new int[26];
				sc.skip("\n");
				for (int i = 0; i < n; i++) {
					String s = sc.nextLine();
					char[] word = new char[s.length()];
					for (int j = 0; j < s.length(); j++) {
						char c = s.charAt(j);
						word[j] = c;
						if (char2digit[c - 'A'] == 0) char2digit[c - 'A'] = 1;
						if (j == 0 && ignoreChar[c - 'A'] == 0) ignoreChar[c - 'A'] = 1;
					}
					words[i] = word;
				}
				
				int m = 1;
				for (int i = 0; i < char2digit.length; i++) {
					if (char2digit[i] == 1) char2digit[i] = m++;
				}
				
				output += solve(words, char2digit, ignoreChar) + "\n";
			}
		}
		sc.close();
		
		System.out.print(output);
	}

}