import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner scan01 = new Scanner(System.in);
		int dayOff = scan01.nextInt();
		int numHomework = scan01.nextInt();

		Integer dayaHomework[] = new Integer[numHomework];
		int sumDays = 0;
		for(int i=0; i<numHomework; i++){
			dayaHomework[i] = scan01.nextInt();
			sumDays = sumDays + dayaHomework[i];
		}

		if(dayOff<sumDays){
			System.out.println("-1");
		}else if(dayOff>=sumDays){
			System.out.println(dayOff-sumDays);
		}
		scan01.close();
	}
}
