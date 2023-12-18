import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doIt();

	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int[] num = new int[100 + 2];
			int from = sc.nextInt();
			int to = sc.nextInt();
			while(from + to > 0){
				num[from - 1]++;
				num[to - 1]++;
				from = sc.nextInt();
				to = sc.nextInt();
			}
			int odd = 0;
			for(int n : num){
				if(n % 2 == 1){
					odd++;
				}
			}
			if(odd == 2 && num[0] % 2 == 1 && num[1] % 2 == 1){
				System.out.println("OK");
			}
			else{
				System.out.println("NG");
			}
		}
	}

}