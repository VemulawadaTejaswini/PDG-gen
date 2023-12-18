import java.util.Scanner;

public class Main {
	private void rect(){
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()){
			int h =scanner.nextInt();
			int w =scanner.nextInt();
			if(h==0 && w==0)break;
			
			if(3<=h && h<=300 && 3<=w && w<=300){
				for(int j=0; j<w; j++){ //top
					System.out.printf("#");
				}System.out.println("");
				
				for(int i=1; i<h-1; i++){
					System.out.printf("#"); //right
					for(int j=1; j<w-1; j++){
						System.out.printf(".");
					}System.out.println("#"); //left
				}
				
				for(int j=0; j<w; j++){ //bottom
					System.out.printf("#");
				}System.out.println("");
				System.out.println("");
			}
		}
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.rect();

	}
}