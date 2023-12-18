//????????????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//??????A??¨??????B????????°????????°?????????
		String[] matrixStr = br.readLine().split(" ");
		
		int rowA = Integer.parseInt(matrixStr[0]);		//??????A????????°rowA
		int colA = Integer.parseInt(matrixStr[1]);		//??????A????????°colA
		int rowB = colA;								//??????B????????°rowB
		int colB = Integer.parseInt(matrixStr[2]);		//??????A????????°colA
		int[][] arrayA = new int[rowA][colA];
		int[][] arrayB = new int[rowB][colB];
		int[][] arrayC = new int[colB][rowA];
		
		//??????A???????´??????????
		for(int i=0; i<rowA; i++) {
			String[] arrayStrA = br.readLine().split(" ");
			for(int j=0; j<colA; j++) {
				arrayA[i][j] = Integer.parseInt(arrayStrA[j]);
			}
		}
		
		//??????B???????´??????????
		for(int i=0; i<rowB; i++) {
			String[] arrayStrB = br.readLine().split(" ");
			for(int j=0; j<colB; j++) {
				arrayB[i][j] = Integer.parseInt(arrayStrB[j]);
			}
		}
		
		for(int i=0; i<rowA; i++) {
			for(int j=0; j<colB; j++) {
				for(int k=0; k<colA; k++) {
					arrayC[i][j]= arrayC[i][j]+ (arrayA[i][k]*arrayB[k][j]);
				}
			}
		}
		for(int i=0; i<colB; i++) {
			for(int j=0; j<rowA; j++) {
				if(j==(rowA-1)) {
					sb.append(arrayC[i][j]);
				}
				else {
					sb.append(arrayC[i][j] + " ");
				}
			}
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}