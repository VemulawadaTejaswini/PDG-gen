
import java.util.Scanner;

public class Main {

	    public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
	        int numN = scan.nextInt();
	        int numM = scan.nextInt();
	        int numL = scan.nextInt();
	        long[][] arrA = new long[numN][numM];
	        long[][] arrB = new long[numM][numL];
	        long[][] arrTot = new long[numN][numL];

	        for(int i=0; i<numN; i++){
	            for(int j=0; j<numM; j++){
	                arrA[i][j] = scan.nextInt();
	            }
	        }

	        for(int i=0; i<numM; i++){
	            for(int j=0; j<numL; j++){
	                arrB[i][j] = scan.nextInt();
	            }
	        }

	        for(int i = 0; i<numN; i++){
	            for(int j=0; j<numL; j++){
	                for(int k = 0; k<numM; k++){
	                	arrTot[i][j] += arrA[i][k]*arrB[k][j];
	                }
	            }
	        }

	        for(int i = 0; i<numN; i++){
	            System.out.print(arrTot[i][0]);
	            for(int j=1;j<numL;j++){
	                System.out.print(" "+arrTot[i][j]);
	        }
	        System.out.println();
	        }

	    }
	}