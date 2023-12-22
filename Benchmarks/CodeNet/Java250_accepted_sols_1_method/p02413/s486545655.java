import java.util.*;
 
class Main{
    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int r = scan.nextInt();
		int[][] arr1 = new int[c][r];
		int[][] arr2 = new int[c+1][r+1];
		int sum = 0;
		//???????????????
		for(int i=0; i<c; i++){
			for(int j=0; j<r; j++){
				int p = scan.nextInt();
				arr1[i][j] = p;
				arr2[i][j] = p;
			}
		}
		//??????????¨????????´?
		for(int i=0; i<c; i++){
			for(int j=0; j<r; j++){
				sum += arr2[i][j];
			}
			arr2[i][r] = sum;
			sum = 0;
		}
		//??????????¨????????´?
		for(int i=0; i<r+1; i++){
			for(int j=0; j<c; j++){
				sum += arr2[j][i];
			}
			arr2[c][i] = sum;
			sum = 0;
		}
		//???????????????
		for(int i=0; i<c+1; i++){
			for(int j=0; j<r+1; j++){
				System.out.print(arr2[i][j]);
				if(j < r){
				System.out.print(" ");
				}
			}
			System.out.println("");
		}
    }
}