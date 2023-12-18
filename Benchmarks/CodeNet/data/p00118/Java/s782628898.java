import java.util.Scanner;

public class Main {
	int h, w;
	char[][] arr = new char[100][100];
	
	void run() {
		Scanner scan = new Scanner(System.in);
		
		for(int l = 0; l < 20; l++) {
			int sum = 0;
			
			h = scan.nextInt();
			w = scan.nextInt();
			if(h == 0 || w == 0) break;
			
			for(int i = 0; i < h; i++) {
				arr[i] = scan.next().toCharArray();
			}
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(arr[i][j] != '1') {
						sum++;
						char tmp = arr[i][j];
						arr[i][j] = '1';
						a_search(i, j, tmp);
					}
				}
			}
			
			System.out.println(sum);
		}
		
	}
	
	void a_search(int i, int j, char tmp) {
		if(i-1 >= 0 && arr[i-1][j] == tmp) {
			arr[i-1][j] = '1';
			a_search(i-1, j, tmp);
		}
		
		if(i+1 < h && arr[i+1][j] == tmp) {
			arr[i+1][j] = '1';
			a_search(i+1, j, tmp);
		}
		
		if(j-1 >= 0 && arr[i][j-1] == tmp) {
			arr[i][j-1] = '1';
			a_search(i, j-1, tmp);
		}
		
		if(j+1 < w && arr[i][j+1] == tmp) {
			arr[i][j+1] = '1';
			a_search(i, j+1, tmp);
		}
	}
	
	
	public static void main(String args[]) {
		new Main().run();
	}
}

