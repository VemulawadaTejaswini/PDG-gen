import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int[][] mat = new int[n+1][n+1];
			for(int i = 0 ; i < mat.length -1; i++){
				for(int j = 0 ; j < mat[i].length -1; j++){
					mat[i][j] = sc.nextInt();
					mat[i][mat.length-1] += mat[i][j];
					mat[mat.length-1][j] += mat[i][j];
				}
			}
			for(int i = 0 ;  i < mat.length -1;i++){
				mat[mat.length-1][mat.length-1] += mat[mat.length-1][i];
			}
			for(int i = 0 ; i < mat.length ; i++){
				for(int j = 0 ; j < mat[i].length ;j++){
					if(1 == String.valueOf(mat[i][j]).length()){
						System.out.print("    " + mat[i][j]);
					} else if(2 == String.valueOf(mat[i][j]).length()){
						System.out.print("   " + mat[i][j]);
					} else if(3 == String.valueOf(mat[i][j]).length()){
						System.out.print("  " + mat[i][j]);
					} else if(4 == String.valueOf(mat[i][j]).length()){
						System.out.print(" " + mat[i][j]);
					} else if(5 == String.valueOf(mat[i][j]).length()){
						System.out.print(mat[i][j]);
					}

				}
				System.out.println();
			}
		}
	}

}