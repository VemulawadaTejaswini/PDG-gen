import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		
		String ringText =scan.nextLine();
		int ringLength = ringText.length();
		char[] ringChar = ringText.toCharArray();
		
		String target =scan.nextLine();
		int targetLength = target.length();
		
		String hikaku = "";
		
		boolean kai = false;
		
		for(int i=0; i<ringLength; i++){
				hikaku = "";
				kai = false;
				
				for(int j=0; j<targetLength; j++){
					int i2 = j;
					if(i + i2 >= ringLength){
						i2 -= ringLength;
					}
					hikaku = hikaku + ringChar[i+i2];
				}
				if(target.equals(hikaku)){
					System.out.println("Yes");
					kai = true;
					break;
				}
		}
		
		if(kai == false){
			System.out.println("No");
		}
	}
}