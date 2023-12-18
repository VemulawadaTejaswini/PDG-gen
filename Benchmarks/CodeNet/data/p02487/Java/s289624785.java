//½ÄH cm æ± W cm Ìgð`­vO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		while(height != 0 || width != 0){
			//[Ìª
			for(int i = 0; i < width ; i++){
				System.out.print("#");
			}
			System.out.println("");
			//^ñ
			for(int i= 1; i < height - 1;i++){
				System.out.print("#");
				for(int j = 1; j < width - 1; j++){
					System.out.print(".");
				}
				System.out.println("#");
			}

			//[Ìª
			for(int i = 0; i < width ; i++){
				System.out.print("#");
			}
			System.out.println("\n");

			height = sc.nextInt();
			width = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}