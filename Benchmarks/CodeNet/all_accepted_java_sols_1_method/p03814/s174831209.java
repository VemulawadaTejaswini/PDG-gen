
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int aCount = 0;
		int zCount = 0;
		int answer = 0;
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String[] splitStr = str.split("",0);
		
		for(int i = 0; i < splitStr.length; i++){
			if(splitStr[i].equals("A")){
					aCount = i;
					break;
			}
		}
		for(int i = 0; i < splitStr.length; i++){
			if(splitStr[i].equals("Z") && i > aCount){
				zCount = i;
			}
				answer = zCount - aCount + 1;
		}
		System.out.println(answer);
	}

}