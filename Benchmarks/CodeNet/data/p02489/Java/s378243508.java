import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,counter=0;
		int[] number = new int[100];
		
		while(true){
			a = sc.nextInt();
			if(a==0) break;
			
			counter++;
			
			number[counter-1] = a;
			
		}
		
		for(int i=0; i<counter; i++){
			System.out.println("case" + " " + (i+1) + ":" + " " + number[i]);
		}
		
	}

}