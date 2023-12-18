import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t, n;
		int up = 0, down = 0;
		int [] block;
		
		t = scan.nextInt();
		
		for(int i = 0; i < t;i++){
			n = scan.nextInt();
			block = new int[n];
			for(int j = 0;i < n; i++){
				block[j] = n;
			}
			
			for(int j = 0; j < n - 1; j++){
				if(block[j] < block[j + 1]){
					if(up < block[j + 1])up = block[j + 1] - block[j];
				}else if(block[j] > block[j + 1]){
					if(block[j] > down)down = block[j] - block[j + 1];
				}
			}
			
			System.out.println(up + " " + down);
		}
	}
}