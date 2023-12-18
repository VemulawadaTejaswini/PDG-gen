import java.util.Scanner;
class Main {
	int [][] cards = new int [5][15];
	private  static String[] cards2 = {"0","S","H","C","D"};
	int n,j,i,k,cards4,Nu;
	String cards3;
	public void ca() {
		Scanner sc = new Scanner(System.in);
		for(j = 1;j <= 4;j++) {
			for(i = 1 ; i <= 13; i++) {
				k = i;
				cards[j][i] = k;
			}
		}
		n = sc.nextInt();
		for(k = 0 ; k < n ; k++) {
			cards3 = sc.next();
			cards4 = sc.nextInt();
			if(cards3.equals( "S" )) {
				Nu = 1;
			} else if(cards3.equals( "H" )) {
				Nu = 2;
			} else if(cards3.equals( "C" )) {
				Nu = 3;
			} else if(cards3.equals( "D" )) {
				Nu = 4;
			}
			switch(Nu) {
				case 1:
					for(j = 1;j <= 13 ; j++) {
						if(cards4 == cards[1][j]) {
							cards[1][j] -= cards4;
						}
					}
					break;
				case 2:
					for(j = 1;j <= 13 ; j++) {
						if(cards4 == cards[2][j]) {
							cards[2][j] -= cards4;
						}
					}
					break;
				case 3:
					for(j = 1;j <= 13 ; j++) {
						if(cards4 == cards[3][j]) {
							cards[3][j] -= cards4;
						}
					}
					break;
				case 4:
					for(j = 1;j <= 13 ; j++) {
						if(cards4 == cards[4][j]) {
							cards[4][j] -= cards4;
						}
					}
					break;
				default:
					break;
			}
		}
		for(j = 1;j <= 4;j++) {
			for(i = 1;i <= 13;i++) {
				if(cards[j][i] != 0) {
					System.out.printf("%S %d\n",cards2[j],cards[j][i]);
				}
			}
		}
	}
	public static void main(String[] agrs) {
		new Main().ca();
	}
}