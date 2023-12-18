import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class T{
		int id;
		double t;
		public T(int id, double t) {
			this.id = id;
			this.t = t;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T[][] r = new T[3][8];
		for(int i=0;i<3;i++){
			for(int j=0;j<8;j++)r[i][j]=new T(sc.nextInt(),sc.nextDouble());
			Arrays.sort(r[i]);
		}
		T[] t = new T[6];
		int x = 0;
		for(int i=0;i<3;i++){
			System.out.printf("%d %.2f\n", r[i][0].id, r[i][0].t);
			System.out.printf("%d %.2f\n", r[i][1].id, r[i][1].t);
			t[x++] = r[i][2];
			t[x++] = r[i][3];
		}
		Arrays.sort(t);
		System.out.printf("%d %.2f\n", t[0].id, t[0].t);
		System.out.printf("%d %.2f\n", t[1].id, t[1].t);
	}
}