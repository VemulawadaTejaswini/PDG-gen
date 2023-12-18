import java.util.*;
public class Main {

	public static void main(String[] args) {
		for(int i = 1;;i++){
			Scanner sc = new Scanner (System.in);
			long x = sc.nextLong();
			if(x == 0) {
				break;
			}
			System.out.println("Case "+ i +": "+ x);
		}

	}

}