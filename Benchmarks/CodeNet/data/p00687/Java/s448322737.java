import java.util.Scanner;

public class Main {

	private void doIt() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			boolean [] exist = new boolean[n+1];
			if(n==0 && a == 0 && b == 0){
				break;
			}

			for(int i=0; i <= n; i++){
				for(int j=0; i * a + j * b <= n; j++){
					int ind = i * a + j * b;
					exist[ind] = true;
				}
			}
			int count = 0;
			for(int i=0; i < n; i++){
				if(! exist[i]){
					count++;
				}
			}
			System.out.println(count);
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}