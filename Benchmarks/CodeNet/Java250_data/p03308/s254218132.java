import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)){

            int n = sc.nextInt();
			int[] R = new int[n];

			for (int i = 0; i < n; i++) {
				R[i] = sc.nextInt();
            }

            System.out.println(getB(R));
		}
    }

    public static int getB(int[] R){
        int minv = R[0];
        int maxv = R[0];
        for (int i = 1; i < R.length; i++) {
            if (R[i] > maxv) {
                maxv = R[i];
            } else if (R[i] < minv){
                minv = R[i];
            }
        }
        return maxv - minv;
    }
}