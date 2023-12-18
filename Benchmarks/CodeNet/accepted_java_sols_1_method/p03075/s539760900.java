import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int k = scan.nextInt();
		if(b-a>k||c-a>k||d-a>k||e-a>k||c-b>k||d-b>k||e-b>k||d-c>k||e-c>k||e-d>k){
			System.out.println(":(");
		}
		else{
			System.out.println("Yay!");
		}
	}
}