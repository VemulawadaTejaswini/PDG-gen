

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		while(true){
		//Scanner scan = new Scanner(System.in);


		int H = scan.nextInt();
	    int W = scan.nextInt();


	    if(H == 0 && W == 0)break;
	    for(int i = 0;i < H ;i++){
	    	for(int j = 0;j < W; j++){

	    		//sb.append("#");
	    		System.out.print("#");
	    	}
	    	System.out.println();
	    	//sb.append("\n");
	    }
	    //sb.append(" \n");
	    System.out.println();
	   }
		//System.out.print(sb);
	}
}