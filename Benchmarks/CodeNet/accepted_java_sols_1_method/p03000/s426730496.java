import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int count=1;
		int coord=0;
		for (int i=0; i<N; i++){
			coord+=sc.nextInt();
			if (coord>X)
				break;
			count++;
		}
		//System.out.println(coord);
		System.out.println(count);
	}

}
