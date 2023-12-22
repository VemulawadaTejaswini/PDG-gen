import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int t, n;
		int ans = 0;
		
		for(int i = 0; i < 4; i++){
			t = scan.nextInt();
			n = scan.nextInt();
			
			if(t == 1)ans = n * 6000;
			else if(t == 2)ans = n * 4000;
			else if(t == 3)ans = n * 3000;
			else if(t == 4)ans = n * 2000;
			
			System.out.println(ans);
		}
	}
}