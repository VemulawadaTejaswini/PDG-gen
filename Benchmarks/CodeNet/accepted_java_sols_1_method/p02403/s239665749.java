import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true){
			int H = s.nextInt();
			int W = s.nextInt();
			if(H==0 && W==0){
				break;
			}
			
			for(int i=1; i<=H; i++){
				for(int j=1; j<=W; j++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
		s.close();
	}

}