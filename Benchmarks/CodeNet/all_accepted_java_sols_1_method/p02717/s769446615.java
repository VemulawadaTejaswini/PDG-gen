import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
 
		int X =scanner.nextInt();
		int Y =scanner.nextInt();
		int Z =scanner.nextInt();
		 
		int A = X ;
		int B = Y ;
		int C = Z ;
		
		int t ;
		
      //tにAの中身を入れて移動
		t=  A ;
		A = B ;
		B = t ;
		
      //tにAの中身を入れて移動
	    t = A ;
		A = C ;
		C = t ;
	
		System.out.println( A + " " + B + " " + C );
    }
}