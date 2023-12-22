import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.print(" ");
		Scanner scan = new Scanner(System.in);
//		String moji =scan.nextLine();
		String moji = "";
		while (scan.hasNext()){
			String in =scan.nextLine();
			moji = moji + in;
		}
		
		char[] ichimoji = moji.toCharArray();
		int nagasa = moji.length();
		int[] fukumu = new int[27];

		for(int i=0; i<nagasa; i++){
			if (Character.isUpperCase(ichimoji[i])){
				ichimoji[i] = Character.toLowerCase(ichimoji[i]);
			}
			if (ichimoji[i] == 'a'){
				fukumu[1] += 1;
			}
			else if (ichimoji[i] == 'b'){
				fukumu[2] += 1;
			}
			else if (ichimoji[i] == 'c'){
				fukumu[3] += 1;
			}
			else if (ichimoji[i] == 'd'){
				fukumu[4] += 1;
			}
			else if (ichimoji[i] == 'e'){
				fukumu[5] += 1;
			}
			else if (ichimoji[i] == 'f'){
				fukumu[6] += 1;
			}
			else if (ichimoji[i] == 'g'){
				fukumu[7] += 1;
			}
			else if (ichimoji[i] == 'h'){
				fukumu[8] += 1;
			}
			else if (ichimoji[i] == 'i'){
				fukumu[9] += 1;
			}
			else if (ichimoji[i] == 'j'){
				fukumu[10] += 1;
			}
			else if (ichimoji[i] == 'k'){
				fukumu[11] += 1;
			}
			else if (ichimoji[i] == 'l'){
				fukumu[12] += 1;
			}
			else if (ichimoji[i] == 'm'){
				fukumu[13] += 1;
			}
			else if (ichimoji[i] == 'n'){
				fukumu[14] += 1;
			}
			else if (ichimoji[i] == 'o'){
				fukumu[15] += 1;
			}
			else if (ichimoji[i] == 'p'){
				fukumu[16] += 1;
			}
			else if (ichimoji[i] == 'q'){
				fukumu[17] += 1;
			}
			else if (ichimoji[i] == 'r'){
				fukumu[18] += 1;
			}
			else if (ichimoji[i] == 's'){
				fukumu[19] += 1;
			}
			else if (ichimoji[i] == 't'){
				fukumu[20] += 1;
			}
			else if (ichimoji[i] == 'u'){
				fukumu[21] += 1;
			}
			else if (ichimoji[i] == 'v'){
				fukumu[22] += 1;
			}
			else if (ichimoji[i] == 'w'){
				fukumu[23] += 1;
			}
			else if (ichimoji[i] == 'x'){
				fukumu[24] += 1;
			}
			else if (ichimoji[i] == 'y'){
				fukumu[25] += 1;
			}
			else if (ichimoji[i] == 'z'){
				fukumu[26] += 1;
			}
		}
		System.out.println("a : "+fukumu[1]);
		System.out.println("b : "+fukumu[2]);
		System.out.println("c : "+fukumu[3]);
		System.out.println("d : "+fukumu[4]);
		System.out.println("e : "+fukumu[5]);
		System.out.println("f : "+fukumu[6]);
		System.out.println("g : "+fukumu[7]);
		System.out.println("h : "+fukumu[8]);
		System.out.println("i : "+fukumu[9]);
		System.out.println("j : "+fukumu[10]);
		System.out.println("k : "+fukumu[11]);
		System.out.println("l : "+fukumu[12]);
		System.out.println("m : "+fukumu[13]);
		System.out.println("n : "+fukumu[14]);
		System.out.println("o : "+fukumu[15]);
		System.out.println("p : "+fukumu[16]);
		System.out.println("q : "+fukumu[17]);
		System.out.println("r : "+fukumu[18]);
		System.out.println("s : "+fukumu[19]);
		System.out.println("t : "+fukumu[20]);
		System.out.println("u : "+fukumu[21]);
		System.out.println("v : "+fukumu[22]);
		System.out.println("w : "+fukumu[23]);
		System.out.println("x : "+fukumu[24]);
		System.out.println("y : "+fukumu[25]);
		System.out.println("z : "+fukumu[26]);
	}
}