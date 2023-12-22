import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long[] ab = {sc.nextLong(),sc.nextLong(),sc.nextLong()};
		if(ab[2] > ab[1] && ab[1] > ab[0]){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
