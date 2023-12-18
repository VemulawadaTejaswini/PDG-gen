import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			   
		int cntNums[] = new int[3];		 
		 
		for(int i = 0; i <= 2; i++){
		    
			int inputNums = sc.nextInt();
		    cntNums[i] = inputNums;    
		 
		}
		
		System.out.println(cntNums[0]*cntNums[1]<cntNums[2]? cntNums[0]*cntNums[1] : cntNums[2]);
	}

}