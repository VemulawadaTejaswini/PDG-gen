import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int ans1 = 0, ans2 = 0;
		int num = 0;
		int h[] = new int[30];
		
		for(int i = 0; i < 28; i++){
			n = scan.nextInt();
			h[n] = n;
		}
		
		while(num != 2){
			for(int i = 0; i < 30; i++){
				if(h[i] == 0){
					if(ans1 == 0){
						ans1 = i;
						num++;
					}else{
						ans2 = i;
						num++;
					}
				}
			}
		}
		
		if(ans1 < ans2){
			System.out.println(ans1);
			System.out.println(ans2);
		}else{
			System.out.println(ans2);
			System.out.println(ans1);
		}
	}
}