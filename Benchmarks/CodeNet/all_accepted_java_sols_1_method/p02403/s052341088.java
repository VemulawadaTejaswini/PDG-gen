import java.util.Scanner;

public class Main {


	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){


		for( ;scan.hasNext();){

			int height = scan.nextInt();
			int width = scan.nextInt();

			//			int height = Integer.parseInt(args[k]);
			//			int width = Integer.parseInt(args[k+1]);

			if(!(height == 0 && width ==0)){

				for(int i = 0;i<height;i++){
					for(int j=0;j < width; j++){
						System.out.print("#");
					}
					System.out.println("");
				}
				System.out.println("");
			}else{
				break;
			}
		}
	}
}

