import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int[] waseda = new int[10];
		int[] keio   = new int[10];
		
		for(int r = 0; r < 10; r++) {
			waseda[r] = stdIn.nextInt();
		}
		for(int r = 0; r < 10; r++) {
			keio[r] = stdIn.nextInt();
		}
		Arrays.sort(waseda);
		Arrays.sort(keio);
		int wasedaSum = 0, keioSum = 0;
		for(int r = 9; r >= 7; r--) {
			wasedaSum += waseda[r];
			keioSum   += keio[r];
		}
		System.out.println(wasedaSum + " " + keioSum);
	}
}