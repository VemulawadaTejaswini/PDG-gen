import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList array = new ArrayList<>();
		for(int i=0;i<3;i++) {
			array.add(sc.nextInt());
		}
		int max =0;
		for(int i=0;i<3;i++) {
			max=Math.max((int)array.get(i), max);
		}
		array.remove(array.indexOf(max));
		int sum=0;
		for(int i=0;i<2;i++) {
			sum+=(int)array.get(i);
		}
		if(max==sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}