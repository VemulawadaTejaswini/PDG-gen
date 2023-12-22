import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int tate,yoko;
		int [][] box = new int [4][13];

			for(tate = 0; tate < 4; tate++){
				for(yoko = 0; yoko < 13; yoko++){

				//?????????1??¨?????§?????????
				box[tate][yoko]=0;
				}
			}

			for(tate = 0; tate < n; tate++){ 

					String str = scanner.next();
					yoko = scanner.nextInt();
					

					if(str.equals("S")){
					box[0][yoko-1]=1;
					}
					else if(str.equals("H")){
					box[1][yoko-1]=1;
					}
					else if(str.equals("C")){
					box[2][yoko-1]=1;
					}
					else if(str.equals("D")){
					box[3][yoko-1]=1;
					}
			}	

			for(tate = 0; tate < 4; tate++){ 

				for(yoko = 0; yoko < 13; yoko++){

					if(tate  == 0){
							if(box[0][yoko]==0){
							System.out.println("S "+(yoko+1));
						}
					}
					if(tate  == 1){
						if(box[1][yoko]==0){
							System.out.println("H "+(yoko+1));
						}
					}
					if(tate  == 2){
						if(box[2][yoko]==0){
							System.out.println("C "+(yoko+1));
						}
					}
					if(tate  == 3){
						if(box[3][yoko]==0){
							System.out.println("D "+(yoko+1));
						}
					}
					
				}
			}
	}
}