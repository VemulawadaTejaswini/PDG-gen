import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		String textString = scan.next();
		char[] text=textString.toCharArray();
		int decreeNum =scan.nextInt();
		int A = 0;
		int B = 0;
		String replaceText= "";
		String answer ="";
		
		for (int i=0; i<decreeNum; i++){
			String decree =scan.next();
			A = scan.nextInt();
			B = scan.nextInt();
			if(decree.equals("replace")){
				replaceText = scan.next();
				for(int j=0; j<(B-A+1); j++){
					text[A+j] = replaceText.charAt(j);
				}
			}
			if(decree.equals("reverse")){
				char[] hozon = (char[])text.clone();
				for(int j=0; j<B-A+1; j++){
					text[B-j] = hozon[j+A];
				}
			}
			if(decree.equals("print")){
				answer = "";
				for(int j=A; j<B+1; j++){
					answer = answer + text[j];
				}
				System.out.println(answer);
			}
		}
	}
}