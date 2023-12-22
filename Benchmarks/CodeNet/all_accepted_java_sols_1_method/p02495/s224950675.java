import java.util.Scanner;

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
				for(int j = 0; j<w; j++){
					if(j%2==0){
						if(i%2==1){
							System.out.print(".");
						}else{
							System.out.print("#");
						}
					}else{
						if(i%2==1){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
			h = sc.nextInt();
			w = sc.nextInt();
		}
	}
}