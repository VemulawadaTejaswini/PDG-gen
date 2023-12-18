import java.util.Scanner;

	

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int sum;
	  	String gra;
	  	int m = 50;
	  	int e = 50;
	  	int r = 100;
	  	
	  	while(true) {
	  		m = scanner.nextInt();
	  		e = scanner.nextInt();
	  		r = scanner.nextInt();
		  	
		  	if( m == -1 && e == -1 && r == -1 )
		  		break;
		  	
	  		sum = m + e;
		  	if(sum >= 80)
		  		gra = "A";
		  	else if( sum >= 65 )
		  		gra = "B";
		  	else if( sum >= 50)
		  		gra = "C";
		  	else if( sum >= 30 || r >= 50 )
		  		gra = "C";
		  	else if( sum >= 30)
		  		gra = "D";
		  	else
		  		gra = "F";
		  		
		  	switch(gra){
		  	case "A":
		  		System.out.println("A");
		  		break;
		  	case "B":
		  		System.out.println("B");
		  		break;
		  	case "C":
		  		System.out.println("C");
		  		break;
		  	case "D":
		  		System.out.println("D");
		  		break;
		  	case "F":
		  		System.out.println("F");
		  	}
		  	
  		}
        scanner.close();
  }
}
