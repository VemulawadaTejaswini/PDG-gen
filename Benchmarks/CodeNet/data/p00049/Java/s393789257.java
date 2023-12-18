import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntA=0; int cntB=0; int cntO=0; int cntAB=0;
		while(sc.hasNext()){
			String t = sc.next();
			String[] temp = t.split(",");
			if(temp[1].equals("A")) cntA++;
			if(temp[1].equals("B")) cntB++;
			if(temp[1].equals("O")) cntO++;
			if(temp[1].equals("AB")) cntAB++;
		}
		System.out.printf("%d%n%d%n%d%n%d%n",cntA,cntB,cntAB,cntO);
	}

}