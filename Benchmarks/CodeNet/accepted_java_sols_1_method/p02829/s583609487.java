import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int[] Ans = {1,2,3};
		int i;
		
		Ans[A-1] = 0;
		Ans[B-1] = 0;
		
		for( i=0;i<3;i++ ){
			if(Ans[i] != 0){
				System.out.println(Ans[i]);
				break;
			}
		}
	}
    
}