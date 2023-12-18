import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] exist = new boolean[500];
		Arrays.fill(exist, false);
		for(int i=0;i<n;i++){
			exist[sc.nextInt()] = true;
		}
		int q = sc.nextInt();
		int t,count=0;;
		for(int i=0;i<q;i++){
			t = sc.nextInt();
			if(exist[t]) count++;
		}
		System.out.println(count);
	}

}