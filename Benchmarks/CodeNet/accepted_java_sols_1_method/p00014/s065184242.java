import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int d = sc.nextInt();
			int x = 0;
			for(int i = d; i < 600; i += d){
				x += (i*i);
			}
			x = x * d;
			System.out.println(x);
		}
	}
}