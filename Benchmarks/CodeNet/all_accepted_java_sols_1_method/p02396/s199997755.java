import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int i = 1;
		while(sc.hasNextInt()){
			int value = sc.nextInt();
			if(value != 0){
				System.out.println("Case " + (i++) + ": " + value);
			}
			else{
				break;
			}
		}
	}
}