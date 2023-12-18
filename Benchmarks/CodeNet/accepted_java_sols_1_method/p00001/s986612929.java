import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		//??????
		int tbl[] = new int[10];
		//
		int c = 9;
		int tmp;
		
		Scanner sc = new Scanner(System.in);
		
		//????????????????´?
		for(int i = 0; i < 10; i++) {
			tbl[i] = sc.nextInt();
		}
		
		//??´???(??????)
		while(c > 0) {
			int i = 0;
			while(i < c) {
				if(tbl[i] < tbl[i+1]) {
					tmp = tbl[i];
					tbl[i] = tbl[i+1];
					tbl[i+1] = tmp;
				}
				i++;
			}
			c--;
		}
		
		//??????
		for(int i = 0; i < 3; i++) {
			System.out.println(tbl[i]);
		}
	}
}