import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		int x, y, z, w;
		int ans;
		
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			
			ans = 0;;
			for(int i = 0; i < n; i++){
				x = scan.nextInt();
				y = scan.nextInt();
				z = scan.nextInt();
				w = scan.nextInt();
				
				if(x + y + z <= 60 && w <= 2)ans += 600;
				else if(x + y + z <= 80 && w <= 5)ans += 800;
				else if(x + y + z <= 100 && w <= 10)ans += 1000;
				else if(x + y + z <= 120 && w <= 15)ans += 1200;
				else if(x + y + z <= 140 && w <= 20)ans += 1400;
				else if(x + y + z <= 160 && w <= 25)ans += 1600;
			}
			System.out.println(ans);
		}
	}
}