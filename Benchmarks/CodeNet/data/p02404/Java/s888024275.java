import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intH;
		int intW;
		while(true){
			intH = scan.nextInt();
			intW = scan.nextInt();
			if(intH == 0 && intW ==0){
				break;
			}
			for(int i = 0; i < intH; i++){
				for(int j = 0; j < intW; j++){
					if(j == 0 || j + 1 == intW || i == 0 || i + 1 == intH){
						System.out.print("#");
					}else{
						System.out.print(".");
					}

				}
				System.out.println();
			}
			System.out.println();
		}

		scan.close();
	}
}