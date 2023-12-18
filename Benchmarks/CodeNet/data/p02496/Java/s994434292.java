import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean[][] card = new boolean[4][13];
		
		n=sc.nextInt();
		
		for(int i=0; i<n; i++){
			int mark,number;
			mark=sc.nextInt();
			number=sc.nextInt();
			card[mark][number-1]=true;
		}
		
		for(int i=0; i<4; i++){
			for(int j=0; j<13; j++){
				if(card[i][j]==false) System.out.println(i + " " + j);
			}
		}
		

	}

}