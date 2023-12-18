import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			boolean[] answerWeight = {false,false,false,false,false,false,false,false,false,false};
			int questionWeight = stdIn.nextInt();
			if(questionWeight >= 512){
				questionWeight -= 512;
				answerWeight[9] = true;
			}
			if(questionWeight >= 256){
				questionWeight -= 256;
				answerWeight[8] = true;
			}
			if(questionWeight >= 128){
				questionWeight -= 128;
				answerWeight[7] = true;
			}
			if(questionWeight >= 64){
				questionWeight -= 64;
				answerWeight[6] = true;
			}
			if(questionWeight >= 32){
				questionWeight -= 32;
				answerWeight[5] = true;
			}
			if(questionWeight >= 16){
				questionWeight -= 16;
				answerWeight[4] = true;
			}
			if(questionWeight >= 8){
				questionWeight -= 8;
				answerWeight[3] = true;
			}
			if(questionWeight >= 4){
				questionWeight -= 4;
				answerWeight[2] = true;
			}
			if(questionWeight >= 2){
				questionWeight -= 2;
				answerWeight[1] = true;
			}
			if(questionWeight >= 1){
				questionWeight -= 1;
				answerWeight[0] = true;
			}
			for(int i = 0;i < answerWeight.length; i++){
				if(answerWeight[i]){
					System.out.print((int)Math.pow(2, i));
					if(!(i == answerWeight.length - 1)){
						for(int j = i + 1;j < answerWeight.length; j++){
							if(answerWeight[j]){
								System.out.print(" ");
								break;
							}
						}
					}
				}
			}
			System.out.println();
		}
	}
}