import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		int cards[][];
		cards = new int [4][13]; //????¬??????§4*13=52
		int i,j,x,b,c;
		b = 0;
			for (i = 0; i < 4; i++) { //??\??????????????´??°????????§???????????£????????????
				for (j=0 ; j<13; j++){
					cards[i][j] = 0;
				}//?????????
			}
			x =scan.nextInt(); //??????????????°??\???

			for (i=0 ;i < x; i++){
				String k = scan.next(); //Stroing??§??????
				int rank = scan.nextInt(); //??????????????°???
					if(k == "S"){
						cards[0][rank-1]=1;
					} else if (k == "H") {
						cards[1][rank-1]=1;
					} else if (k == "C") {
						cards[2][rank-1]=1;
					} else if (k == "D"){
						cards[3][rank-1]=1;
					}
					for (i = 0; i < 4; i++) {
						for (j = 0; j < 13; j++){
							 if (cards[i][j] == 0 && i==0){
								 System.out.println("S "+(j+1));
							 } else if (cards[i][j] == 0 && i == 1){
								 System.out.println("H "+(j+1));
							 } else if (cards[i][j] == 0 && i == 2){
								 System.out.println("C "+(j+1));
							 } else if (cards[i][j] == 0 && i == 3) {
								 System.out.println("D "+(j+1));
							 }
						}
					}
			}
	}
}