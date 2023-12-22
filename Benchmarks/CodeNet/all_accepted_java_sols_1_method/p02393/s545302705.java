import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int intInput1 = scan.nextInt();
		int intInput2 = scan.nextInt();
		int intInput3 = scan.nextInt();
		int intSub = 0;
		if(intInput1 > intInput2){
			intSub = intInput1;
			intInput1 = intInput2;
			intInput2 = intSub;
			if(intInput2 > intInput3){
				intSub = intInput2;
				intInput2 = intInput3;
				intInput3 = intSub;
			}
		}else if(intInput2 > intInput3){
			intSub = intInput2;
			intInput2 = intInput3;
			intInput3 = intSub;
		}
		if(intInput1 > intInput2){
			intSub = intInput1;
			intInput1 = intInput2;
			intInput2 = intSub;
			if(intInput2 > intInput3){
				intSub = intInput2;
				intInput2 = intInput3;
				intInput3 =intInput2;
			}
		}
		System.out.println(intInput1 + " " + intInput2 + " " + intInput3);
	}
}