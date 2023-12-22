import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int j,k;
		int maxv = -1000000000;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int R[] = new int[n];
		for(j=0;j<n;j++)R[j] = Integer.parseInt(sc.next());
		int minv = R[0];

			for(k=1;k<n;k++){
				maxv = Math.max(R[k]-minv,maxv);
				minv = Math.min(minv,R[k]);
				}
			System.out.println(maxv);
	}

}