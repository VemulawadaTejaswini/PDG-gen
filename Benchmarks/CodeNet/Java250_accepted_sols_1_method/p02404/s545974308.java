import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        int H = sc.nextInt();
        int W = sc.nextInt();
        if ( H < 3 ) break;
        for ( int i = 0; i < H; i++ ){
        	 if(i==0 || i==H-1){
            for ( int j = 0; j < W; j++ ){
               
                    System.out.print("#");
                    
                }
        	 }
            else{
            	for ( int j = 0; j < W; j++ ){
            		if(j==0 || j==W-1){
            			System.out.print("#");
            		}
            		else{
            			System.out.print(".");
            		}
            }
            }
            System.out.println("");
        }
        System.out.println();
    }
}
}
