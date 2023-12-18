import java.util.Scanner;

class Run{
	public int m = 50;
	public int e = 50;
	public int r = 100;
}
	

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int sum;
	  	String gra;
	  	
	  	Run runs = new Run();
	  	
	  	while(true) {
	  		runs.m = scanner.nextInt();
	  		runs.e = scanner.nextInt();
	  		runs.r = scanner.nextInt();
		  	
		  	if( runs.m == -1 && runs.e == -1 && runs.r == -1 )
		  		break;
		  	
	  		sum = runs.m + runs.e;
	  		
	  		
		  	if(sum >= 80)
		  		gra = "A";
		  	else if( sum >= 65 )
		  		gra = "B";
		  	else if( sum >= 50)
		  		gra = "C";
		  	else if( sum >= 30 && runs.r >= 50 )
		  		gra = "C";
		  	else if( sum >= 30)
		  		gra = "D";
		  	else
		  		gra = "F";
		  		
		  	if( runs.m == -1 || runs.e == -1 )
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
