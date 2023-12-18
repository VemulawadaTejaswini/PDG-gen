import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int H = s.nextInt();
	int W = s.nextInt();
	int i, j;
	while(H!=0 && W!=0){
		for(i=0; i<H; i++){
			for(j=0; j<W; j++){
				if(i%2!=0){
					if(j%2!=0){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}else{
					if(j%2!=0){
						System.out.print(".");
					}else{
						System.out.print("#");
					}
				}
			}
			System.out.println("");
		}
		System.out.println("");
		H = s.nextInt();
		W = s.nextInt();
	}
	}
}