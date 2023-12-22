import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringA = sc.next();
		String stringB = sc.next();
		sc.close();
		int lengthA = stringA.length();	
		boolean match = false;
		char[] chars = new char[lengthA];
		for(int a = 0; a < lengthA; a++){
			chars[a] = stringA.charAt(a);
		}
		for(int move = 0 ; move < lengthA ; move++){
			char[] tmpStringAc = new char[lengthA];
			int inputPoint = 0;
			for(int inputChar = 0 ; inputChar < lengthA ; inputChar++){
				inputPoint = inputChar + move;
				if(inputPoint>=lengthA){
					inputPoint = inputPoint - lengthA;
				}
				tmpStringAc[inputPoint] = chars[inputChar];
			}
			String tmpStringA = new String(tmpStringAc);
			if(tmpStringA.equals(stringB)){
				match = true;
				break;
			}
		}
		System.out.println(match?"Yes":"No");
	}
}