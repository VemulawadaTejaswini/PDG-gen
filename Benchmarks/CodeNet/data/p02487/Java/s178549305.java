import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc;
	public void execution(int h, int w){
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(i == 0 || i == h-1 || j == 0 || j == w-1){
					System.out.print("#");
				}
				else System.out.print(".");
			}
			System.out.println();
		}
	}
	public void run(){
		sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();

		while(sc.hasNextInt()){
			int value = sc.nextInt();
			int value2 = sc.nextInt();
			if(value == 0 && value2 == 0){
				break;
			}
			else{
				execution(value, value2);
				System.out.println();
			}
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}