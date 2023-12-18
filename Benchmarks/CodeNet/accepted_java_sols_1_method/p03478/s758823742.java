import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum =0;
		for(int i = 1; i <= n;i++){
			int x = 0;
			for(char c : String.valueOf(i).toCharArray()){
				x += Character.getNumericValue(c);
			}
			if(a <= x && x <= b) sum += i;
		}
		System.out.println(sum);
	}
}
