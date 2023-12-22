import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		int student = -1;
		while(true){
			student =scan.nextInt();
			if (student == 0){
				break;
			}
			
			int[] score = new int[student];
			double average = 0.0;
			for(int i=0;i<student; i++){
				score[i] = scan.nextInt();
				average += score[i];
			}
			average /= student;		//????¨??????° / ????????° ??? ?????????
			double deviation = 0.0;
			for(int i=0; i<student; i++){
				deviation += (score[i] - average) * (score[i] - average);
			}
			deviation /= student;
			deviation = Math.sqrt(deviation);
			System.out.println(deviation);
		}
	}
}