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
			int[] shuffleBegin = new int[shuffleTimes];
			
			for(int i =0;i<shuffleTimes; i++){
				shuffleBegin[i] = scan.nextInt();
			answer = "";
				for(int j=0; j<(targetLength - shuffleBegin[i]) ; j++){
					answer = answer + targetChar[j + shuffleBegin[i]];
				}
				
				for(int j=0; j<shuffleBegin[i]; j++){
					answer = answer + targetChar[j];
				}
				
			targetChar = answer.toCharArray();
			}
			System.out.println(answer);		
		}
	}
}