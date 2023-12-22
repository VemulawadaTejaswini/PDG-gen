import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	int residents[][][] = new int[4][3][10];
        int n,b, f, r, v;
        
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for(int i = 0;i < n;i++){
			b = scanner.nextInt();
			f = scanner.nextInt();
			r = scanner.nextInt();
			v = scanner.nextInt();
			
			residents[b-1][f-1][r-1] += v;
		}
		
		for(int i = 0;i < 4;i++){
			for(int j = 0;j < 3;j++){
				for(int k = 0;k < 10;k++){
					System.out.print(" "+residents[i][j][k]);
				}
				System.out.println();
			}
			if(i != 3){
				System.out.println("####################");
			}						
		}		
    	scanner.close();
    }
}