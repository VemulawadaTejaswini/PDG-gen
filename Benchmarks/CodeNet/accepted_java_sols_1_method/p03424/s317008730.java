import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arare[] = new int[N];

		for(int n=0;n<N;n++){
			String st = sc.next();
			switch(st){
				case "P":
				 arare[n] = 0;
				break;
				case "W":
				 arare[n] = 1;
				break;
				case "G":
				 arare[n] = 2;
				break;
				case "Y":
				 arare[n] = 3;
				break;

			}
		}

		int alist[]={0,0,0,0};
		for(int n=0;n<N;n++){
			alist[ arare[n] ]++;
		}

		int count=0;
		for(int n=0;n<4;n++){
			if(alist[n] != 0) count++;
		}

		if(count==3) System.out.println("Three");
		if(count==4) System.out.println("Four");

	}
}