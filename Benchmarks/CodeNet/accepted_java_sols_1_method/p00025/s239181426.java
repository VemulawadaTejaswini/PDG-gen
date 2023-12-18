import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int[] hit = new int[10000];
		int[] blow = new int[10000];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				int[] A = new int[4];
				int[] B = new int[4];
				int[] check = new int[10];
				int sum = 0;
				for(int i = 0; i < 4; i++){
					A[i] = stdIn.nextInt();
					check[A[i]] = 1;
				}
				for(int i = 0; i < 4; i++){
					B[i] = stdIn.nextInt();
					if( check[B[i]] == 1 ){
						sum++;
					}
				}
				int h = 0;
				for(int i = 0; i < 4; i++){
					if( A[i] == B[i] ){
						h++;
					}
				}
				hit[index] = h;
				blow[index] = sum-h;
				index++;
			}
			
			for(int i = 0; i < index; i++){
				System.out.println(hit[i] + " " + blow[i]);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}