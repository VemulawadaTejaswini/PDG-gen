import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.print(" ");
		Scanner scan = new Scanner(System.in);
		String word = "";		//???????????????string
		int[] shuffleBegin = new int[100]; //?????£?????????????§????
		String odai = "";
		String temp = "";
		String kansei = "";
		while(!temp.equals("-")){
			temp = scan.next();
			if(temp.equals("-")){
				break;
			}
			odai = temp;
			char[] odaiChar = odai.toCharArray();
			int odaiNagasa = odai.length();
//			T.add(tem) ;
			int kai = scan.nextInt();
			for(int i=0; i<kai; i++){
				shuffleBegin[i] = scan.nextInt();
				
			}
			for(int i =0;i<kai; i++){
				for(int ii=0; ii<(odaiNagasa - shuffleBegin[i]) ; ii++){
					word = word + odaiChar[ii + shuffleBegin[i]];
//					System.out.println(word);
				}
				for(int ii=0; ii<shuffleBegin[i]; ii++){
					word = word + odaiChar[ii];
//					System.out.println(word);
				}
			odaiChar = word.toCharArray();
			kansei = word;
			word = "";
			}
			System.out.println(kansei);		
			
		}
	}
}