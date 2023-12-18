import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, count = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		for(int i = a; i < b; i++){
			if(c % i == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}