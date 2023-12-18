import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] blood = new int[4];
		String[] temp = new String[2];
		while (sc.hasNext()) {
			temp = sc.next().split(",");
			if (temp[1].equals("A")) {blood[0]++;}
			else if (temp[1].equals("B")) {blood[1]++;}
			else if (temp[1].equals("AB")) {blood[2]++;}
			else if (temp[1].equals("O")) {blood[03]++;}
		}
		for (int i=0; i<4; i++) {
			out.println(blood[i]);
		}
	}
}
