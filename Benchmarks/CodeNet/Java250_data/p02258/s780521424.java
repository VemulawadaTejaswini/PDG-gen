import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] R = new int[n];
		
		for(int i=0;i<n;i++){
			R[i] = Integer.parseInt(sc.next());
		}
		
		int max=R[1]-R[0];
		int Rmin=R[0];
		for(int i=1;i<n;i++){
			if(max<R[i]-Rmin) max=R[i]-Rmin;
			if(Rmin>R[i]) Rmin=R[i];
		}
		System.out.println(max);

	}

}