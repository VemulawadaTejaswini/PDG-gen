import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.print(" ");
		Scanner scan = new Scanner(System.in);
		String ring =scan.nextLine();
		String kadai =scan.nextLine();
		char[] moji = ring.toCharArray();
		int kadainagasa = kadai.length();
		String hikaku = "";
		int hikakunagasa = ring.length();
		int kai = 0;
		for(int i=0; i<hikakunagasa; i++){
				hikaku = "";
				kai = 0;
				for(int ii=0; ii<kadainagasa; ii++){
					int i2 = ii;
					if(i + i2 >= hikakunagasa){
						i2 -= hikakunagasa;
					}
					hikaku = hikaku + moji[i+i2];
				}
//				System.out.println(hikaku);
				if(kadai.equals(hikaku)){
					System.out.println("Yes");
					kai = 1;
					break;
				}
		}
		if(kai == 0){
			System.out.println("No");
		}
	}
}