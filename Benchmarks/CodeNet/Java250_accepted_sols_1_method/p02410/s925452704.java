import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int n,m;
        int result = 0;
        
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		int A[][] = new int[n][m];
		int b[]   = new int[m];
		
		for(int i = 0;i < n;i++){
			for(int j = 0;j < m;j++){
				A[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0;i < m;i++){
			b[i] = scanner.nextInt();
		}
		
		for(int i = 0;i < n;i++){
			for(int j = 0;j < m;j++){
				result += A[i][j]*b[j];
			}
			System.out.println(result);
			result = 0;
		}
    	scanner.close();
    }
}