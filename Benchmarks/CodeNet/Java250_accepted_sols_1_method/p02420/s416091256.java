import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		String answer = "";
		String temp = "";
		
		while(true){
			temp = scan.next();
			if(temp.equals("-")){
				break;
			}
			char[] targetChar = temp.toCharArray();
			int targetLength = temp.length();
			int shuffleTimes = scan.nextInt();
			int shuffleBegin = 0;

			for(int i =0; i<shuffleTimes; i++){
				shuffleBegin = scan.nextInt();
				answer = "";

				for(int j=0; j<(targetLength - shuffleBegin) ; j++){
					answer = answer + targetChar[j + shuffleBegin];
				}
				for(int j=0; j<shuffleBegin; j++){
					answer = answer + targetChar[j];
				}
				targetChar = answer.toCharArray();
			}
			System.out.println(answer);
		}
	}
}