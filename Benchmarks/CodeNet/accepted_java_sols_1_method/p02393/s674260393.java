import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		short[] abc = {sc.nextShort(),sc.nextShort(),sc.nextShort()};
		short tmp;
		for(byte i = 0;i < abc.length;i++){
			for(byte j = -1;j < abc.length - 1;j++){
				if(abc[i] < abc[j + 1]){
					tmp = abc[j+1];
					abc[j+1] = abc[i];
					abc[i] = tmp;
				}
			}
		}
		System.out.println(abc[0] + " " + abc[1] + " " + abc[2]);
	}
}
