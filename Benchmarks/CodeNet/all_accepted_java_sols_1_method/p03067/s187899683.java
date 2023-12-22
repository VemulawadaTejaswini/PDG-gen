import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int R[] = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		sc.close();
		int max = R[0];
		int min = R[0];
		for (int i=0;i<R.length;i++) {
			max = Math.max(max,R[i]);
			min = Math.min(min,R[i]);
		}
		String ans = (R[2]!=max&&R[2]!=min)?"Yes":"No";
		System.out.print(ans+"\n");
	}
}