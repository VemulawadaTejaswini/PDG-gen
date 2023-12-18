import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	boolean J = true;
	  	int i,j;
	  	
	  	while(J) {
	  		
		  	int  w = scanner.nextInt();			//入力
		  	int  h = scanner.nextInt();
		  	
		  	if( h == 0 && w == 0 )
		  		break;
	  		
		  	for(i = 1; i <= h ; i ++){
		  		for(j = 1; j <= w ; j++){
		  			if(j == w) {
		  				if(i == h)
		  					System.out.println("# ");
		  				else
		  					System.out.println("# ");
		  				}
		  			else	
		  				System.out.print("#");
		  		}
		  	}
		  	System.out.println(" ");
		  	
  		}
        scanner.close();
  }
}
