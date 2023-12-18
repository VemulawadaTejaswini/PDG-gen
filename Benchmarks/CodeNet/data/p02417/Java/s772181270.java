import java.util.Scanner;


public class Main {

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
long[] Alf = new long[26];
		AOJ: while(true) {

		String mojiretsu = sc.next();
		
		
		if(mojiretsu == null)break AOJ;
		






		for(int i = 0;i < mojiretsu.length();i++) {

			char kaiseki = mojiretsu.charAt(i);

			if(kaiseki == 'a' || kaiseki == 'A') {
				Alf[0] = Alf[0] + 1;

			}else if(kaiseki == 'b' || kaiseki == 'B') {
				Alf[1] = Alf[1] + 1;

			}else if(kaiseki == 'c' || kaiseki == 'C') {
				Alf[2] = Alf[2] + 1;

			}else if(kaiseki == 'd' || kaiseki == 'D') {
				Alf[3] = Alf[3] + 1;

			}else if(kaiseki == 'e' || kaiseki == 'E') {
				Alf[4] = Alf[4] + 1;

			}else if(kaiseki == 'f' || kaiseki == 'F') {
				Alf[5] = Alf[5] + 1;

			}else if(kaiseki == 'g' || kaiseki == 'G') {
				Alf[6] = Alf[6] + 1;

			}else if(kaiseki == 'h' || kaiseki == 'H') {
				Alf[7] = Alf[7] + 1;

			}else if(kaiseki == 'i' || kaiseki == 'I') {
				Alf[8] = Alf[8] + 1;

			}else if(kaiseki == 'j' || kaiseki == 'J') {
				Alf[9] = Alf[9] + 1;

			}else if(kaiseki == 'k' || kaiseki == 'K') {
				Alf[10] = Alf[10] + 1;

			}else if(kaiseki == 'l' || kaiseki == 'L') {
				Alf[11] = Alf[11] + 1;

			}else if(kaiseki == 'm' || kaiseki == 'M') {
				Alf[12] = Alf[12] + 1;

			}else if(kaiseki == 'n' || kaiseki == 'N') {
				Alf[13] = Alf[13] + 1;

			}else if(kaiseki == 'o' || kaiseki == 'O') {
				Alf[14] = Alf[14] + 1;

			}else if(kaiseki == 'p' || kaiseki == 'P') {
				Alf[15] = Alf[15] + 1;

			}else if(kaiseki == 'q' || kaiseki == 'Q') {
				Alf[16] = Alf[16] + 1;

			}else if(kaiseki == 'r' || kaiseki == 'R') {
				Alf[17] = Alf[17] + 1;

			}else if(kaiseki == 's' || kaiseki == 'S') {
				Alf[18] = Alf[18] + 1;

			}else if(kaiseki == 't' || kaiseki == 'T') {
				Alf[19] = Alf[19] + 1;

			}else if(kaiseki == 'u' || kaiseki == 'U') {
				Alf[20] = Alf[20] + 1;

			}else if(kaiseki == 'v' || kaiseki == 'V') {
				Alf[21] = Alf[21] + 1;

			}else if(kaiseki == 'w' || kaiseki == 'W') {
				Alf[22] = Alf[22] + 1;

			}else if(kaiseki == 'x' || kaiseki == 'X') {
				Alf[23] = Alf[23] + 1;

			}else if(kaiseki == 'y' || kaiseki == 'Y') {
				Alf[24] = Alf[24] + 1;

			}else if(kaiseki == 'z' || kaiseki == 'Z') {
				Alf[25] = Alf[25] + 1;

			
			}else {
				break AOJ;
				
				
			}

			
			}
		}
		

		




		System.out.println("a : " + Alf[0]);
		System.out.println("b : " + Alf[1]);
		System.out.println("c : " + Alf[2]);
		System.out.println("d : " + Alf[3]);
		System.out.println("e : " + Alf[4]);
		System.out.println("f : " + Alf[5]);
		System.out.println("g : " + Alf[6]);
		System.out.println("h : " + Alf[7]);
		System.out.println("i : " + Alf[8]);
		System.out.println("j : " + Alf[9]);
		System.out.println("k : " + Alf[10]);
		System.out.println("l : " + Alf[11]);
		System.out.println("m : " + Alf[12]);
		System.out.println("n : " + Alf[13]);
		System.out.println("o : " + Alf[14]);
		System.out.println("p : " + Alf[15]);
		System.out.println("q : " + Alf[16]);
		System.out.println("r : " + Alf[17]);
		System.out.println("s : " + Alf[18]);
		System.out.println("t : " + Alf[19]);
		System.out.println("u : " + Alf[20]);
		System.out.println("v : " + Alf[21]);
		System.out.println("w : " + Alf[22]);
		System.out.println("x : " + Alf[23]);
		System.out.println("y : " + Alf[24]);
		System.out.println("z : " + Alf[25]);


		}


}




