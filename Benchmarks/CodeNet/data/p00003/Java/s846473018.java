import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int [] side = new int[3];
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < 3; j++){
				side[j] = stdIn.nextInt();
			}
			if (side[0] > side[2]){
				int tmp = side[0];
				side[0] = side[2];
				side[2] = tmp;
			}
			if (side[1] > side[2]){
				int tmp = side[1];
				side[1] = side[2];
				side[2] = tmp;
			}
			
			if (side[0] * side[0] + side[1] * side[1] == side[2] * side[2]){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}