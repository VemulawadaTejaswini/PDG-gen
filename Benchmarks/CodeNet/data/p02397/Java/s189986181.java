
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int x, y, w, j, i = 0;
		ArrayList<Integer> t = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while(i < 10000){
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0)
				break;
			else if(x > y){
				w = x;
				x = y;
				y = w;
			}
			t.add(new Integer(x));
			t.add(new Integer(y));
			i++;
		}
		j = i;
		for(i = 1; i - 1 != j; i++){
			System.out.println(t.get(new Integer(i - 1)) + " " + t.get(new Integer(i)));
		}
	
	}
}