import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		
		int height = 0;
		int width = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(;;){
			
			String line = sc.nextLine();
			String[] array = line.split(" ");
			
			height = Integer.parseInt(array[0]);
			width = Integer.parseInt(array[1]);
			
			if(height == 0 && width == 0){
				sc.close();
				break;
			}
			else{
				for(int rowIndex = 0; rowIndex < height; rowIndex++ ){
					for(int columnIndex = 0; columnIndex < width; columnIndex++){
						System.out.print("#");
					}
					System.out.println();
				}
				System.out.println();
			}
		}
		

	}

}