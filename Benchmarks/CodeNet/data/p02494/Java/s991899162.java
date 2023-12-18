import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args){
    int H=1;
    int W=1;
    Scanner sc = new Scanner(System.in); 
    while(H!=0&&W!=0){
    	H = sc.nextInt();
    	W = sc.nextInt();
    	for(int h=0;h<H;h++){
    		for(int w=0;w<W;w++){
    			System.out.print("#");
    		}
    		System.out.println("");
    	}
    	
    	
    }
	}
}