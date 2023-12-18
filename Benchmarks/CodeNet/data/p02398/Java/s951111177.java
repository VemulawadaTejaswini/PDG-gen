import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intA = scan.nextInt();
		int intB = scan.nextInt();
		int intC = scan.nextInt();
		if(intB < intA){
			int intTemp = intA;
			intA = intB;
			intB = intTemp;
		}
		int intCount = 0;
		for(int i = 0; i <= intB - intA; i++){
			if(intC % (intA + i) ==0){
				intCount++;
			}
		}
		System.out.println(intCount);
	}
}