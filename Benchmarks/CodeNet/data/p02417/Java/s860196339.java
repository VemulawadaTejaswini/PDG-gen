import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		
		// ??\???
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\r\\n");
		int X[];
		X = new int[26];
		String S = "a";
		while(true){
			String s = scan.next();
			// ???????????????
			int sl = s.length();
			if(sl == 0) break;
			int x=0;
			for (int i=1; i<sl; i++){
				// ?????????????????????
				S = s.substring(i, i+1);
				if((S.equals ("a"))||(S.equals("A"))) x=1;
				if((S.equals ("b"))||(S.equals("B"))) x=2;
				if((S.equals ("c"))||(S.equals("C"))) x=3;
				if((S.equals ("d"))||(S.equals("D"))) x=4;
				if((S.equals ("e"))||(S.equals("E"))) x=5;
				if((S.equals ("f"))||(S.equals("F"))) x=6;
				if((S.equals ("g"))||(S.equals("G"))) x=7;
				if((S.equals ("h"))||(S.equals("H"))) x=8;
				if((S.equals ("i"))||(S.equals("I"))) x=9;
				if((S.equals ("j"))||(S.equals("J"))) x=10;
				if((S.equals ("k"))||(S.equals("K"))) x=11;
				if((S.equals ("l"))||(S.equals("L"))) x=12;
				if((S.equals ("m"))||(S.equals("M"))) x=13;
				if((S.equals ("n"))||(S.equals("N"))) x=14;
				if((S.equals ("o"))||(S.equals("O"))) x=15;
				if((S.equals ("p"))||(S.equals("P"))) x=16;
				if((S.equals ("q"))||(S.equals("Q"))) x=17;
				if((S.equals ("r"))||(S.equals("R"))) x=18;
				if((S.equals ("s"))||(S.equals("S"))) x=19;
				if((S.equals ("t"))||(S.equals("T"))) x=20;
				if((S.equals ("u"))||(S.equals("U"))) x=21;
				if((S.equals ("v"))||(S.equals("V"))) x=22;
				if((S.equals ("w"))||(S.equals("W"))) x=23;
				if((S.equals ("x"))||(S.equals("X"))) x=24;
				if((S.equals ("y"))||(S.equals("Y"))) x=25;
				if((S.equals ("z"))||(S.equals("Z"))) x=26;
				X[x-1] = X[x-1]+1;
			}
		}
		System.out.println("a" + " : " + X[0]);
		System.out.println("b" + " : " + X[1]);
		System.out.println("c" + " : " + X[2]);
		System.out.println("d" + " : " + X[3]);
		System.out.println("e" + " : " + X[4]);
		System.out.println("f" + " : " + X[5]);
		System.out.println("g" + " : " + X[6]);
		System.out.println("h" + " : " + X[7]);
		System.out.println("i" + " : " + X[8]);
		System.out.println("j" + " : " + X[9]);
		System.out.println("k" + " : " + X[10]);
		System.out.println("l" + " : " + X[11]);
		System.out.println("m" + " : " + X[12]);
		System.out.println("n" + " : " + X[13]);
		System.out.println("o" + " : " + X[14]);
		System.out.println("p" + " : " + X[15]);
		System.out.println("q" + " : " + X[16]);
		System.out.println("r" + " : " + X[17]);
		System.out.println("s" + " : " + X[18]);
		System.out.println("t" + " : " + X[19]);
		System.out.println("u" + " : " + X[20]);
		System.out.println("v" + " : " + X[21]);
		System.out.println("w" + " : " + X[22]);
		System.out.println("x" + " : " + X[23]);
		System.out.println("y" + " : " + X[24]);
		System.out.println("z" + " : " + X[25]);
		
	}

}