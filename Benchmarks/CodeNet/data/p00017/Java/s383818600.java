import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int[] order;
	static String[] theCandidates;
	static String[] thisCandidates;
	static String[] thatCandidates;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		setup();
		String line;
		while (in.hasNextLine()) {
			line = in.nextLine();
			String[] dataset = line.split("\\s++");
			int shift = getShift(dataset);
			//System.out.printf("shift: %d\n", shift);
			for (String s : dataset) {				
				sb.append(shiftWordBy(s, shift)).append(' ');
			}
			sb.append('\n');
		}
		System.out.print(sb);

	}
	
	static String shiftWordBy(String s, int shift) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char currChar = s.charAt(i);
			if (currChar == '.') {
				sb.append('.');
			} else if (currChar-shift >= 'a') {
				sb.append((char)(currChar-shift));
			} else {
				int flowover = (currChar-shift) - 'a';
				sb.append((char)('a'+flowover));
			}
		}
		return sb.toString();
	}
	static int getShift(String[] dataset) {
		int shift = -1;
		for (String s : dataset) {
			if (isThe(s)) {
				shift = getShift(theCandidates, s);
				break;
			} else if (isThis(s)) {
				shift = getShift(thisCandidates, s);
				break;
			} else if (isThat(s)) {
				shift = getShift(thatCandidates, s);
				break;
			}
		}
		return shift;
	}
	static boolean isThis(String s) {
		return contains(thisCandidates, s);
	}
	static boolean isThat(String s) {
		return contains(thatCandidates, s);
	}
	static boolean isThe(String s) {
		return contains(theCandidates, s);
	}
	
	static int getShift(String[] candidates, String s) {
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i].equals(s)) return i;
		}
		return -1;
	}
	
	static boolean contains(String[] candidates, String s) {
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i].equals(s)) return true;
		}
		return false;
	}
	static void setup() {
		theCandidates = new String[26];
		thisCandidates = new String[26];
		thatCandidates = new String[26];
		char[] the = {'t','h','e'};
		char[] thiss = {'t','h','i','s'};
		char[] that = {'t','h','a','t'};
		for (int i = 0; i < 26; i++) {
			theCandidates[i] = new String(the);
			thisCandidates[i] = new String(thiss);
			thatCandidates[i] = new String(that);
			for (int j = 0; j < 3; j++) {
				the[j] =  the[j]!= 'z'? (char)(the[j]+1) : 'a';
			}
			for (int j = 0; j < 4; j++) {
				thiss[j] =  thiss[j] != 'z'? (char)(thiss[j]+1) : 'a';
				that[j] =  that[j] != 'z'? (char)(that[j]+1) : 'a';
			}
		}
	}
}