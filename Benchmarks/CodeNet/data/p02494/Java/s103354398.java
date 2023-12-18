import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		
		while(h != 0 || w != 0){
			for(int i = 0; i<h; i++){
				for(int j = 0; j<w-1; j++){
					System.out.print("#");
				}
				System.out.println("#");
			}
			System.out.println("");
			h = sc.nextInt();
			w = sc.nextInt();
		}

	}

}