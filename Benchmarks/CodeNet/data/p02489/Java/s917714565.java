import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,counter=0;
		int[] number = new int[100];
		
		while(true){
			x = sc.nextInt();
			if(x==0) break;
			
			number[counter]=x;
			
			counter++;
			
		}
				
		for(int i=0; i<counter; i++)
			System.out.println("case " + (i+1) + ": " + number[i]);
		
	}
	
	
}