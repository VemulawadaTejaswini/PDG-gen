import java.util.*;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long posFirst = Long.parseLong(sc.next());
		long numStep = Long.parseLong(sc.next());
		long lenStep = Long.parseLong(sc.next());
		long result = 0;

		posFirst = Math.abs(posFirst);

		// while(posFirst >= 0){
		// 	if(numStep == 0) break;

		// 	posFirst -= lenStep;
		// 	numStep--;
		// }
		long numStepTmp = posFirst / lenStep;
		
		if(numStepTmp > numStep){
			posFirst = posFirst - lenStep * numStep;
			System.out.println(Math.abs(posFirst));
			return;
		}

		numStep -= numStepTmp;
		posFirst = posFirst % lenStep;

		if(numStep % 2 == 1){
			posFirst = Math.abs(posFirst) - lenStep;
		}

		System.out.println(Math.abs(posFirst));
		// System.out.println(numStep);
	}
}
