import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(;;){
			int H =  sc.nextInt();
		    int W =  sc.nextInt();
		    int n = 0;
		    int a = 0;     //??¶??°??????
		    if(W%2==1)a=1; //?\???°??????
		    if(H==0 && W==0) break;
		    for(int i=0; i<H; i++){
		    	for(int j=0; j<W; j++){
		    		if(n%2==0){
		    			System.out.print("#");
		    		}else{
		    			System.out.print(".");
		    		}
		    		n++;
		    	}
		    	System.out.println();
			    if(a==0)n++;
		    }
	    	System.out.println();
		}
	}
}