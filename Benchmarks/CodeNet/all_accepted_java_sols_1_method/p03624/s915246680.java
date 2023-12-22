import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		Arrays.sort(s);
		List<String> alphabetList = new ArrayList<String>();
		alphabetList.add("a");
		alphabetList.add("b");
		alphabetList.add("c");
		alphabetList.add("d");
		alphabetList.add("e");
		alphabetList.add("f");
		alphabetList.add("g");
		alphabetList.add("h");
		alphabetList.add("i");
		alphabetList.add("j");
		alphabetList.add("k");
		alphabetList.add("l");
		alphabetList.add("m");
		alphabetList.add("n");
		alphabetList.add("o");
		alphabetList.add("p");
		alphabetList.add("q");
		alphabetList.add("r");
		alphabetList.add("s");
		alphabetList.add("t");
		alphabetList.add("u");
		alphabetList.add("v");
		alphabetList.add("w");
		alphabetList.add("x");
		alphabetList.add("y");
		alphabetList.add("z");
		for(int i=0;i <s.length;i++) {
			if(i ==0) {
				alphabetList.remove(s[i]);
				continue;
			}
			if(s[i].equals(s[i-1])) {
				continue;
			}else {
				alphabetList.remove(s[i]);
			}
		}
		if(alphabetList.isEmpty()) {
			System.out.println("None");
		}else {
			System.out.println(alphabetList.get(0));
		}
	}
}