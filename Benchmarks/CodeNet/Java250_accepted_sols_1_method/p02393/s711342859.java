import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] x = new int[3];

		for(int i = 0;i < 3;i++)	x[i] = scan.nextInt();

		for(int i = 0;i < 3;i++){
			int tmp = x[i];
			int j;
			for(j = i;j > 0 && x[j-1] > tmp;j--)
				x[j] = x[j-1];
			x[j] = tmp;
		}

		System.out.println(x[0] + " " + x[1] + " " + x[2]);
	}
}