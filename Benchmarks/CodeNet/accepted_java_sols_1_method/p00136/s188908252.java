import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n;
		int i, j;
		int ct[];
		float h;
		
		ct = new int[6];
		
		n = input.nextInt();
		
		for (i = 0; i < n; i++){
			h = input.nextFloat();
			if (h < 165.0){
				ct[0]++;
			}
			else if (h < 170.0){
				ct[1]++;
			}
			else if (h < 175.0){
				ct[2]++;
			}
			else if (h < 180.0){
				ct[3]++;
			}
			else if (h < 185.0){
				ct[4]++;
			}
			else {
				ct[5]++;
			}
		}
		
		for (i = 0; i < 6; i++){
			System.out.print(i + 1 + ":");
			for (j = 0; j < ct[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}