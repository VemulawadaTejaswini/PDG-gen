import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= 7;i++) {
			if(Math.pow(2,i) > n){
				System.out.print((int) Math.pow(2,i-1));
				break;
			}
		}
	}
}
