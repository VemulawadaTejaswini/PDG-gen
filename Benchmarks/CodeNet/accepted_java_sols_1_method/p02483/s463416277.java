import java.util.Scanner;


class Main {
	public static void main(String[] args){
		int[] n = new int[5];
		
		Scanner input = new Scanner(System.in);
		int min;
		for (int i = 0; i < 3; i++)n[i] = input.nextInt();
		
		
		for (int i = 0; i < 2; i++){
			min = i;
			for(int j = i + 1; j < 3; j++){
				if (n[min] > n[j])min = j;
			}
			
			int dam;
			
			dam = n[i];
			n[i] = n[min];
			n[min] = dam;
		}
		
		System.out.println(n[0] + " " + n[1] + " " + n[2]);
	}
}