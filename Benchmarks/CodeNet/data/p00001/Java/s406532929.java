import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Toi junbi = new Junbi2();
		junbi.solve();
	}
}

interface Toi{
	public void solve();
}

class Junbi1 implements Toi{
	public void solve(){
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}
}

class Junbi2 implements Toi{
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for (int i = 0; i < 3; i++) {
			System.out.println(array[array.length - (i + 1)]);
		}
	}
}
