import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int m, n;
		int a;
		
		int count;
		
		while(true){
			m = scan.nextInt();
			n = scan.nextInt();
			if(m == 0)break;
			
			count = 0;
			for(int i = m;i <= n; i++){
				a = i;
				while(true){
					if(a == 1){
						count++;;
						break;
					}
					if(a % 2 != 0 && a % 3 != 0 && a % 5 != 0){
						break;
					}
					if(a % 2 == 0)a /= 2;
					else if(a % 3 == 0)a /= 3;
					else if(a % 5 == 0)a /= 5;
				}
			}
			System.out.println(count);
		}
	}
}