import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int t, n, i;
		int s, f;
		
		while ((t = input.nextInt()) != 0){
			n = input.nextInt();
			for (i = 0; i < n; i++){
				s = input.nextInt();
				f = input.nextInt();
				t -= (f - s);
			}
			if (t > 0){
				System.out.println(t);
			}
			else {
				System.out.println("OK");
			}
		}
	}
}