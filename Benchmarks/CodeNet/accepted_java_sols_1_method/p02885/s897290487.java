import java.util.Scanner;
class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

      	int X = 0;
      
		int A = sc.nextInt();
		int B = sc.nextInt();
      
      	X = A - B * 2;
          
        if (X > 0) {
        	System.out.print(X);
        } else {
        	System.out.print(0);
        }
		return;
	}
}