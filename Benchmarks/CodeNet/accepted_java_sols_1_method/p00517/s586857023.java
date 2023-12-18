public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		int n = in.nextInt();
		int[] xspot = new int[n];
		int[] yspot = new int[n];
		for (int i=0; i<n; i++) {
			xspot[i] = in.nextInt();
			yspot[i] = in.nextInt();
		}
		int sum = 0;
		for (int i=0; i<n-1; i++) {
			int tmp = 0;
			int x = Math.abs(xspot[i] - xspot[i+1]); //横
			int y = Math.abs(yspot[i] - yspot[i+1]); //縦
			if ((xspot[i] <= xspot[i+1] == true && yspot[i] <= yspot[i+1] == true) || (xspot[i] <= xspot[i+1] == false && yspot[i] <= yspot[i+1] == false)){
				if (x > y)
					tmp -= y;
				else
					tmp -= x;
			}
			 sum = sum + tmp + x + y;
		}
		System.out.println(sum);
	}
}