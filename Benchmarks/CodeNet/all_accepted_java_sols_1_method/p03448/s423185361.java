import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int X = s.nextInt();
		
		int count = 0;
		for(int i = 0;i <= A;i++){
			for(int j = 0;j <= B;j++){
				for(int k = 0;k <= C;k++){
					if(i*500 + j*100 + k*50 == X){
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
	}
	
}