
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		if(X >= 10000){
			System.out.println(1);
		}else{
			boolean can[] = new boolean[X + 1];
			can[0] = true;
			for(int rep = 0 ; rep < 100 ; ++rep){
				for(int i = 0 ; i < can.length ; ++i){
					if(can[i]){
						for(int j = 0 ; j <= 5 ; ++j){
							if(i + j + 100 < can.length){
								can[i + j + 100] = true;							
							}
						}
					}
				}				
			}
			if(can[X]){
				System.out.println(1);
			}else{
				System.out.println(0);				
			}
				
		}
	}
}
