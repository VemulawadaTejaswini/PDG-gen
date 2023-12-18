import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		String textString = scan.next();
		char[] text=textString.toCharArray();
		int num =scan.nextInt();
		int A =0;
		int B =0;
		String repText= "";
		String syutu ="";
		for (int j=0; j<num; j++){
			String decree =scan.next();
			A = scan.nextInt();
			B = scan.nextInt();
			if(decree.equals("replace")){
				repText = scan.next();
				for(int i=0; i<(B-A+1); i++){
					text[A+i] = repText.charAt(i);
				}
			}
			if(decree.equals("reverse")){
				char[] hozon = (char[])text.clone();
				for(int i=0; i<B-A+1; i++){
					text[B-i] = hozon[i+A];
				}
			}
			if(decree.equals("print")){
				syutu = "";
				for(int i=A; i<B+1; i++){
					syutu = syutu + text[i];
				}
				System.out.println(syutu);
				
			}
		}

	}
}