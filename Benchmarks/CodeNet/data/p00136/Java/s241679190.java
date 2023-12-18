import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		double h;
		int[] d = new int[6];
		
		n = scan.nextInt();
		for(int i = 0; i < n; i++){
			h = scan.nextDouble();
			if(h < 165.0)d[0]++;
			else if(h < 170.0)d[1]++;
			else if(h < 175.0)d[2]++;
			else if(h < 180.0)d[3]++;
			else if(h < 185.0)d[4]++;
			else d[5]++;
		}
		for(int i = 0; i < 6; i++){
			System.out.print(i + 1 + ":");
			for(int j = 0; j < d[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}