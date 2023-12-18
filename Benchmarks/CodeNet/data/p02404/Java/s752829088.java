import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
	
		for(;scan.hasNext();){

			int i=0;

			int height = scan.nextInt();
			int width = scan.nextInt();
//			int height = Integer.parseInt(args[k]);
//			int width = Integer.parseInt(args[k+1]);
			
			if(!(height == 0 && width ==0)){

				for(i = 0;i<height;i++){

					if(i == 0 || i == height-1){//先頭の場合
						for(int j=0;j < width; j++){
							System.out.print("#");
						}
						System.out.println("");


					}else{
						for(int j=0;j < width; j++){
							if(j==0 || j == width-1){
								System.out.print("#");
							}else{
							System.out.print(".");
							}
						}
						System.out.println("");
					}
				}
			}
			
			if(height == 0 && width== 0){
				break;
			}
			System.out.println("");		//H=0,W=0のときは改行しない
		}

	}
}
