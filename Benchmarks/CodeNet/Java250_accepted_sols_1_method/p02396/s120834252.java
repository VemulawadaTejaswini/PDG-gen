
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int x, i = 0, j;
		ArrayList<Integer> t = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while(i < 10000){
			x = sc.nextInt();
			if(x == 0)
				break;
			t.add(new Integer(x));
			i++;
		}
		j = i;
		for(i = 1; i - 1 != j; i++){
			System.out.println("Case " + i + ":" + " " + t.get(new Integer(i - 1)));
		}
		
	}
}