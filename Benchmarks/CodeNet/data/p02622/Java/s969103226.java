import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int count = 0;
	int whilecount = 0;
	String inputS = sc.next();
	String inputT = sc.next();
	sc.close();

	ArrayList<String> S = new ArrayList<String>();
	ArrayList<String> T = new ArrayList<String>();

	for(int i = 0; i < inputS.length(); i++) {
		S.add(inputS.substring(0, i));
	}

	for(int i = 0; i < inputT.length(); i++) {
		T.add(inputT.substring(0, i));
	}

	while(true) {
		if(S.get(whilecount) == T.get(whilecount)) {

		}else if(S.get(whilecount) == null || T.get(whilecount) == null) {
			break;
		}else {
			count += 1;
		}
	}
	System.out.println(count);

}
}