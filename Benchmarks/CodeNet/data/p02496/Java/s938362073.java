public class Main {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int cards[][] = new int [4][14];
		int i, j;
		for(i = 0 ; i < n ; i++){
			String mark = scan.next();
			int number = scan.nextInt();
			if(mark.equals("S")){
				cards[0][number] = 1; 
			} else if (mark.equals("H")){
				cards[1][number] = 1;
			} else if (mark.equals("C")){
				cards[2][number] = 1;
			} else if (mark.equals("D")){
				cards[3][number] = 1;
			}
		}
		for(i = 0 ; i < 4 ; i++){
			for(j = 1 ; j < 14 ; j++){
				if(cards[i][j] != 1){
					if(i == 0){
						System.out.println("S " + j);
					} else if(i == 1){
						System.out.println("H " + j);
					} else if(i == 2){
						System.out.println("C " + j);
					} else if(i == 3){
						System.out.println("D " + j);
					}
				}
			}
			
		}
	}

}