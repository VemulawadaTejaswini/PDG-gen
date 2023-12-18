import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int c = scanner.nextInt();
		int r = scanner.nextInt();
		
		
		int[][] A; 
		A = new int[r+1][c+1];//合計を表す領域を作るために+1
		
		for(int i=0;i<c;i++){
			for(int f=0;f<r;f++){
			int n= scanner.nextInt();
				A[f][i]=n;//A[行][列]
			}
		}
        int sum1=0;
        
		for(int i=0;i<c+1;i++){
			
			for(int f=0;f<r+1;f++){

					if((f == r)&&(!(i == c) )){
					System.out.println(A[f][i]);//行の合計、列の合計、総合計、その他に場合分けして出力
					
					}
					else if((!(f ==r))&&(i == c)){
						System.out.print(A[f][i]+" ");
					}
					else if((f ==r) && (i==c)){
						for(int g=0;g<c;g++){
							A[r][c]=A[r][c]+A[r][g];

						}
						 System.out.println(A[r][c]);
					}
					else {
						sum1=A[r][i]+A[f][i];
					    A[r][i]=sum1;
					    sum1=0;
					    
					    sum1=A[f][c]+A[f][i];
					    A[f][c]=sum1;
					    sum1=0;
					    
						System.out.print(A[f][i]+" ");
					}}
				
				
			}
		
		scanner.close();

	}
}

