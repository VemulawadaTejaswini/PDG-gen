import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A - B >= 0) {
			System.out.println("delicious");
		}else if(Math.abs(A - B) <= X){
			System.out.println("safe");
		}else{
			System.out.println("dangerous");
		}
	}
	
}