import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i;
		int n;
		int x, y;
		int h, w;
		int fee = 0;
		int lar;
		
		while (fee != 1){
			n = input.nextInt();
			
			if (n == 0){
				break;
			}
			
			fee = 0;
			for (i = 0; i < n; i++){
				x = input.nextInt();
				y = input.nextInt();
				h = input.nextInt();
				w = input.nextInt();
			
				lar = x + y + h;
				if (lar <= 60 && w <= 2){
					fee += 600;
				}
				else if (lar <= 80 && w <= 5){
					fee += 800;
				}
				else if (lar <= 100 && w <=10){
					fee += 1000;
				}
				else if (lar <= 120 && w <= 15){
					fee += 1200;
				}
				else if (lar <= 140 && w <= 20){
					fee += 1400;
				}
				else if (lar <= 160 && w <= 25){
					fee += 1600;
				}
			}
			System.out.println(fee);
		}
	}
}