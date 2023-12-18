import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int[] a, b;
		a = new int[4];
		b = new int[4];
		
		int hit, blow;
		
		while(scan.hasNextInt()){
			for(int i = 0; i < 4; i++){
				a[i] = scan.nextInt();
			}
			
			for(int i = 0; i < 4; i++){
				b[i] = scan.nextInt();
			}
			
			hit = 0;
			blow = 0;
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					if(a[i] == b[j]){
						if(i == j)hit++;
						else blow++;
					}
				}
			}
			
			System.out.println(hit + " " + blow);
		}
	}
}