import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int n1 = s.nextInt();
		int n4 = n1 % 10;
		n1 /= 10;
		int n3 = n1 % 10;
		n1 /= 10;
		int n2 = n1 % 10;
		n1 /= 10;
		
		int [][] arr = new int [][]{{0,0,0},{0,0,1},{0,1,0},{0,1,1},{1,0,0},
				{1,0,1},{1,1,0},{1,1,1}};
		
		int sum = n1;
		
		for (int i = 0; i < arr.length; i++) {
			sum = n1;
				sum = (arr[i][0]==0) ? (sum-n2) : (sum+n2);
				sum = (arr[i][1]==0) ? (sum-n3) : (sum+n3);
				sum = (arr[i][2]==0) ? (sum-n4) : (sum+n4);
				
			if(sum ==7){
				System.out.println(n1 + (arr[i][0]==0?"-":"+") + n2 +
						(arr[i][1]==0?"-":"+") + n3 +(arr[i][2]==0?"-":"+") + n4 + "=7");
				System.exit(0);
			}
		}
	}
}
