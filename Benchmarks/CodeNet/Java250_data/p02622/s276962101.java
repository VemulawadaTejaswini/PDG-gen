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
		S.add(inputS.substring(i, i+1));
	}

	for(int i = 0; i < inputT.length(); i++) {
		T.add(inputT.substring(i, i+1));
	}

	for(int i = 0; i < inputS.length(); i++){
		if(S.get(whilecount).equals(T.get(whilecount))) {

		}else {
			count += 1;
		}
		whilecount += 1;
	}
	System.out.println(count);
}
}