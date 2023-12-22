import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int sum = 0;
		for(int i = x;i <= y;i++){
			if(z % i == 0)sum++;
		}
		System.out.println(sum);
	}
}