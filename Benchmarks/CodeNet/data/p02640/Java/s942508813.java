import java.util.*;

public class Main {
	public static void main(String[] args) {
			Scanner scan =  new Scanner(System.in);
			int X = scan.nextInt();
			int Y = scan.nextInt();
			if(Y<=X*4 && Y>=X*2 && Y%2 == 0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
	}
}
