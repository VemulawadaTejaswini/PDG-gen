import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);


		//H,Wが両方とも0になるまで繰り返す
		while(true) {


			//縦、横の高さ
			int H  = src.nextInt();
			int W  = src.nextInt();
			

	        //HW両方が0になった場合終了
		     if((W == 0) && (H == 0)) {
		    	 break;
		     }


			//縦の列の繰り返し
	        for (int i = 1; i <= H; i++) {

	        	
	        	//縦の交互
	        	if(i % 2 == 0) {
	        		
		        	//横の列の繰り返し、交互１
		            for (int j = 1; j <= W; j++) {
		            	if(j % 2 == 0) {
			                System.out.print("#");
		            	}else {
		            		System.out.print(".");
		            	}
		            }
		        }else {

		        	
		        	//横の列の繰り返し、交互2
		            for (int j = 1; j <= W; j++) {
		            	if(j % 2 == 0) {
			                System.out.print(".");
		            	}else {
		            		System.out.print("#");
		            	}
	
		            }
	        	}


	            //縦に１列進む
	            System.out.println();
			}

	        System.out.println();

		}
	}
}
