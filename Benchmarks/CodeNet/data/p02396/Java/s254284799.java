import java.util.*;
public class Main {

	public static void main(String[] args) {
		int i, count = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
			i = sc.nextInt();
			count++;
			if(i == 0)
				break;
			else
				System.out.println("Case " + count + ": " + i);
		}
	}

}