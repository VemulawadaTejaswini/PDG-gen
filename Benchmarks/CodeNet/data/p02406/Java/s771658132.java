
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";
		for(int i = 1; i <= n; i++){
			if(i % 3 == 0){
				s += " " + i;
			}else{
				int k = i;
				while(k != 0){
					if(k % 10 == 3){
						s += " " + i;
						break;
					}
					k /= 10;
				}
			}
		}
		System.out.println(s);
	}
}

