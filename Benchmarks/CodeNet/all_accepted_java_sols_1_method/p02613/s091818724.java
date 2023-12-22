import java .util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	ArrayList<String> sList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int countAC = 0;
	int countWA = 0;
	int countTLE = 0;
	int countRE = 0;
	int inputN = sc.nextInt();

	for(int i = 0; i < inputN; i++) {
		String inputS = sc.next();
		sList.add(inputS);
	}

	for(int i = 0; i < inputN; i++) {
		if(sList.get(i).equals("AC")) {
			countAC++;
		}
		else if(sList.get(i).equals("WA")) {
			countWA++;
		}
		else if(sList.get(i).equals("TLE")) {
			countTLE++;
		}
		else{
			countRE++;
		}
	}

	System.out.println("AC x " + countAC);
	System.out.println("WA x " + countWA);
	System.out.println("TLE x " + countTLE);
	System.out.println("RE x " + countRE);
	}
}