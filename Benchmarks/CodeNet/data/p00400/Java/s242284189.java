import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		if(N >= 65 && N <=90){
			System.out.println(1);
		}else if(N >= 97 && N <=122){
			System.out.println(2);
		}else{
			System.out.println(0);
		}
	}
}
