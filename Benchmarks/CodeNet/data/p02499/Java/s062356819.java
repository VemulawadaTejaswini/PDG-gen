import java.util.Scanner;

public class CountingCharacters {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int[] a = new int[30];
		for (int j = 0; j < 30; j++) {
			a[j] = 0;
		}
		for (int i = 0; i < str.length(); i++) {
			String str2 = String.valueOf(str.charAt(i));
			String str3 = str2.toLowerCase();
			switch (str3) {
			case "a":
				a[0] += 1;
				break;
			case "b":
				a[1] += 1;
				break;
			case "c":
				a[2] += 1;
				break;
			case "d":
				a[3] += 1;
				break;
			case "e":
				a[4] += 1;
				break;
			case "f":
				a[5] += 1;
				break;
			case "g":
				a[6] += 1;
				break;
			case "h":
				a[7] += 1;
				break;
			case "i":
				a[8] += 1;
				break;
			case "j":
				a[9] += 1;
				break;
			case "k":
				a[10] += 1;
				break;
			case "l":
				a[11] += 1;
				break;
			case "m":
				a[12] += 1;
				break;
			case "n":
				a[13] += 1;
				break;
			case "o":
				a[14] += 1;
				break;
			case "p":
				a[15] += 1;
				break;
			case "q":
				a[16] += 1;
				break;
			case "r":
				a[17] += 1;
				break;
			case "s":
				a[18] += 1;
				break;
			case "t":
				a[19] += 1;
				break;
			case "u":
				a[20] += 1;
				break;
			case "v":
				a[21] += 1;
				break;
			case "w":
				a[22] += 1;
				break;
			case "x":
				a[23] += 1;
				break;
			case "y":
				a[24] += 1;
				break;
			case "z":
				a[25] += 1;
				break;
			}
		}
		System.out.println("a : " + a[0]);
		System.out.println("b : " + a[1]);
		System.out.println("c : " + a[2]);
		System.out.println("d : " + a[3]);
		System.out.println("e : " + a[4]);
		System.out.println("f : " + a[5]);
		System.out.println("g : " + a[6]);
		System.out.println("h : " + a[7]);
		System.out.println("i : " + a[8]);
		System.out.println("j : " + a[9]);
		System.out.println("k : " + a[10]);
		System.out.println("l : " + a[11]);
		System.out.println("m : " + a[12]);
		System.out.println("n : " + a[13]);
		System.out.println("o : " + a[14]);
		System.out.println("p : " + a[15]);
		System.out.println("q : " + a[16]);
		System.out.println("r : " + a[17]);
		System.out.println("s : " + a[18]);
		System.out.println("t : " + a[19]);
		System.out.println("u : " + a[20]);
		System.out.println("v : " + a[21]);
		System.out.println("w : " + a[22]);
		System.out.println("x : " + a[23]);
		System.out.println("y : " + a[24]);
		System.out.println("z : " + a[25]);
		System.out.println();
	}
}