import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int t = sc.nextInt();
			if(t == 0) break;
			int n = sc.nextInt();
			for(int i = 0 ; i < n ; i++){
				int s = sc.nextInt();
				int f = sc.nextInt();
				t -= f - s;
			}
			if(t <= 0){
				System.out.println("OK");
			} else {
				System.out.println(t);
			}
		}
		
		
		sc.close();
	}

}