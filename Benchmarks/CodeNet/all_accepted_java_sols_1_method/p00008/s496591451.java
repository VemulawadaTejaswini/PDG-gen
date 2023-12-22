import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
		int n = sc.nextInt();
		int x = 0;
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 10; b++){
				for(int c = 0; c < 10; c++){
					for(int d = 0; d < 10; d++){
						if(a + b + c + d == n)x++;
					}
				}
			}
		}
		System.out.println(x);
		}
	}
}