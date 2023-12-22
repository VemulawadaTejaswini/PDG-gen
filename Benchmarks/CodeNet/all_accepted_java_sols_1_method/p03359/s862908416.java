import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		for(int i = 1 ; i < 13 ; i++) {
			if(a == i) {
				if(b >= i) {
					System.out.println(i);
					break;
				}else {
					System.out.println(i-1);
					break;
				}
			}
		}
	}
}