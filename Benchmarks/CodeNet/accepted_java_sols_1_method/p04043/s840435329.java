import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[3];
		
		for(int i = 0;i<3;i++){
			A[i] = scan.nextInt();
		}
		
		Arrays.sort(A);//昇順にソート
		
		if(A[0]==5&&A[1]==5&&A[2]==7)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
		
		
	}

}
