import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(;;){
			int H =  sc.nextInt();
		    int W =  sc.nextInt();
		    if(H==0 && W==0) break;
		    for(int i=0; i<W; i++){
		    	for(int j=0; j<H; j++){
		    		System.out.print("#");
		    	}
		    	System.out.println();
		    }
	    	System.out.println();
		}
	}
}