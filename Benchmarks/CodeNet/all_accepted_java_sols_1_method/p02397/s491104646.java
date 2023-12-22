
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int x, y, w, j, i = 0;
		ArrayList<Integer> X = new ArrayList<Integer>();
		ArrayList<Integer> Y = new ArrayList<Integer>();
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
			X.add(new Integer(x));
			Y.add(new Integer(y));
			i++;
		}
		j = i;
		for(i = 0; i != j; i++){
			System.out.println(X.get(new Integer(i)) + " " + Y.get(new Integer(i)));
		}
	
	}
}