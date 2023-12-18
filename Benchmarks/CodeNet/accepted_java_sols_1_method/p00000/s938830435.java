import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				System.out.printf("%dx%d=%d\n", i, j, i * j);
			}
		}
	}
}