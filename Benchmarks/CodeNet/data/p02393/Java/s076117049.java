import java.util.Scanner;
public class Main {
	void sort(){
		int a;
		int max;
		int min;
		int tmp;
		Scanner s = new Scanner(System.in);
		max = s.nextInt();
		a = s.nextInt();
		if(a > max){
			tmp = max;
			max = a;
			a = tmp;
		}
		min = s.nextInt();
		if(a < min){
			tmp = min;
			min = a;
			a = tmp;
		}
		System.out.println(min + " " + a + " " + max);
	}
	public static void main(String args[]){
		Main m = new Main();
		m.sort();
	}
}