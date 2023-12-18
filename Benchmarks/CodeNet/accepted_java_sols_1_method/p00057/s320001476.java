import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n, num;
		
		while (input.hasNext()){
			n = input.nextInt();
			num = (n + 1) * n / 2 + 1;
			System.out.println(num);
		}
	}
}