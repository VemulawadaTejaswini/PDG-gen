import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,counter=0;
		int[] number = new int[100];
		
		while(true){
			x = sc.nextInt();
			if(x==0) break;
			
			counter++;
			
			System.out.println("case" + " " + (counter) + ":" + " " + x);
			
		}
		
	}
	
}
		