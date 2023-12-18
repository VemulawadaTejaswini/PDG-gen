
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x, i = 0, j, t[];
		t = new int[10000];
		Scanner sc = new Scanner(System.in);
		while(i < 10000){
			x = sc.nextInt();
			if(x == 0)
				break;
			t[i] = x;
			i++;
		}
		j = i;
		if(i != 10000){
			for(i = 1; i - 1 != j; i++){
				System.out.println("case " + i + ":" + " " + t[i-1]);
			}
		}
	}
}