import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		//????????¨?¨???????????????????
		Scanner sc = new Scanner(System.in);

		//
		while(true){
			int intH = sc.nextInt();
			int intW = sc.nextInt();

			if((intH == 0) && (intW == 0)){
				break;
			}

			for(int i = 0; i < intH; i++){
				String A = "";
				for(int j = 0; j < intW; j++){
					A += "#";
					//if(j == (intW - 1)){
					//	System.out.println("#");
					//}else{
					//	System.out.print("#");
					//}
				}
				System.out.println(A);
			}
			System.out.println("");


		}
	}
}