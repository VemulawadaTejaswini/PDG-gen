import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int i,j;
		Scanner in = new Scanner(System.in);
		
		i = in.nextInt();
		j = in.nextInt();
		
		if(i<j){
			System.out.println("a < b");
		}else if(i>j){
			System.out.println("a > b");
		}else{
			System.out.println("a == b");
		}
	}
}