import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n,x;
			n = sc.nextInt();
			x = sc.nextInt();
				if(n == 0 && x == 0)break;
		int c = 0;
		for(int k = 1 ; k < n-1 ; k++){
			for(int j = k+1 ; j < n ; j++){
				for(int i=j+1 ; i < n+1 ; i++){
					if(i + j + k == x){
						c++;
					}
				}
			}
		}
		System.out.println(c);
		}
	}
}