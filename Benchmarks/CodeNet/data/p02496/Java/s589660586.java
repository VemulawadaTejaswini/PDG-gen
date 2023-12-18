import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[][] card = new boolean[4][13];
		final String marks[] ={"S","H","C","D"};
		int n,number;
		String mark;
		
		n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			mark = sc.next();
			number = sc.nextInt();
			
			for(int j=0; j<4; j++){
				if( mark.equals(marks[j]) ){
					card[j][number-1]=true;
					break;
				}
			}
		}
		
		for(int i=0; i<4; i++)
			for(int j=0; j<12; j++)
				if(card[i][j]==false)
					System.out.println(marks[i] + " " + (j+1) );
			
		
		
	}

}