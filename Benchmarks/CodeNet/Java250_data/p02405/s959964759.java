import java.util.Scanner;

public class Main {
	private void rect(){
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()){
			int h =scanner.nextInt();
			int w =scanner.nextInt();
			int checker;
			if(h==0 && w==0)break;
			
			if(h<=300 && w<=300){
				for(int i=0; i<h; i++){
					for(int j=0; j<w; j++){
						checker=(i+j)%2;
						if(checker==0){
							System.out.printf("#");
						}else System.out.printf(".");
					}
					System.out.println("");
				}
				System.out.println("");
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.rect();

	}
}