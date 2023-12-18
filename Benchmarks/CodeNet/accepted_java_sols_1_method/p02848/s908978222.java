import java.util.HashMap;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new java.util.Scanner (System.in);

		int N = sc.nextInt();
		String s = sc.next();

		String[] list  = new String[s.length()];
		list = s.split("");

		String[] moji = new String[26];

		moji[0]="A";
		moji[1]="B";
		moji[2]="C";
		moji[3]="D";
		moji[4]="E";
		moji[5]="F";
		moji[6]="G";
		moji[7]="H";
		moji[8]="I";
		moji[9]="J";
		moji[10]="K";
		moji[11]="L";
		moji[12]="M";
		moji[13]="N";
		moji[14]="O";
		moji[15]="P";
		moji[16]="Q";
		moji[17]="R";
		moji[18]="S";
		moji[19]="T";
		moji[20]="U";
		moji[21]="V";
		moji[22]="W";
		moji[23]="X";
		moji[24]="Y";
		moji[25]="Z";

		HashMap <String, Integer> map = new HashMap <String,Integer>();

		map.put("A",1);
		map.put("B",2);
		map.put("C",3);
		map.put("D",4);
		map.put("E",5);
		map.put("F",6);
		map.put("G",7);
		map.put("H",8);
		map.put("I",9);
		map.put("J",10);
		map.put("K",11);
		map.put("L",12);
		map.put("M",13);
		map.put("N",14);
		map.put("O",15);
		map.put("P",16);
		map.put("Q",17);
		map.put("R",18);
		map.put("S",19);
		map.put("T",20);
		map.put("U",21);
		map.put("V",22);
		map.put("W",23);
		map.put("X",24);
		map.put("Y",25);
		map.put("Z",26);

		for (int index=0; index<s.length(); index++) {
			int num = N+map.get(list[index])-1;

			if (num>=26) {
				num-=26;
			}
			list[index]=moji[num];
		}

		for (int index=0; index<s.length(); index++) {
			System.out.print(list[index]);
		}

		System.out.println();
		sc.close();


	}
}