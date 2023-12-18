import java.util.Scanner;
import java.util.ArrayDeque;
public class Main {
    static int LIMIT = 200001;
    public static int[] sectionDiagrams = new int[LIMIT];
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	char[] section = scan.nextLine().toCharArray();
	calculateDiagrams(section, 1);
	for (int i = 0; i < section.length; i++) {
	    if (section[i] == '\\') {
		section[i] = '/';
	    } else if (section[i] == '/') {
		section[i] = '\\';
	    }
	}
	calculateDiagrams(section, -1);
	ArrayDeque<Integer> diagrams = new ArrayDeque<Integer>();
	int sum = 0;
	for (int i = 0; i < LIMIT; i++) {
	    if (sectionDiagrams[i] != 0) {
		diagrams.add(sectionDiagrams[i]);
		sum += sectionDiagrams[i];
	    }
	}
	System.out.println(sum);
	System.out.print(diagrams.size());
	while (diagrams.size() != 0) {
	    System.out.print(" " + diagrams.poll());
	}
	System.out.println();
    }
    static void calculateDiagrams (char[] section, int direction) {
	boolean isIn = false;
	int outH = 0, nowH = 0;
	int sum = 0, inP = 0;
	int sp = 0;
	if (direction == -1) {
	    sp = section.length - 1;
	}
	for (int i = sp; i >=0 && i < section.length; i += direction) {
	    if (isIn == false) {
		if (section[i] == '\\') {
		    isIn = true;
		    outH = nowH;
		    nowH--;
		    inP = i;
		    sum = 1;
		} else if (section[i] == '/') {
		    nowH++;
		}
	    } else {
		if (section[i] == '\\') {
		    sum += outH - nowH + 1;
		    nowH--;
		} else if (section[i] == '/') {
		    nowH++;
		    sum += outH - nowH;
		} else if (section[i] == '_') {
		    sum += outH - nowH;
		}
		if (nowH == outH) {
		    if (direction == 1 && sectionDiagrams[inP] < sum) {
			sectionDiagrams[inP] = sum;
		    } else if (direction == -1 && sectionDiagrams[i] < sum){
			sectionDiagrams[i] = sum;
		    }
		    isIn = false;
		}
	    }
	}
    }
}