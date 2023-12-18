import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int[] side = new int[3];
		int n;
		
		n = stdIn.nextInt();
		for (int i = 0; i < n; i++){
			for (int j = 0; j < 3; j++){
				side[j] = stdIn.nextInt();
				side[j] *= side[j];
			}
			if (side[0] == side[1] + side[2]){
				System.out.println("YES");
			}
			else if (side[1] == side[2] + side[0]){
				System.out.println("YES");
			}
			else if (side[2] == side[0] + side[1]){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}