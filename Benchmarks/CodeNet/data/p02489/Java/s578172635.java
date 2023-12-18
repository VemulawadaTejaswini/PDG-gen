import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,counter=1;
		
		while(true){
			x = sc.nextInt();
			if(x==0) break;
			
			System.out.println("case " + counter + ": " + x);
			counter++;

		}
		
	}
	
}