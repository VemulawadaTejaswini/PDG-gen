import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int y = scan.nextInt();
			int m = scan.nextInt();
			int d = scan.nextInt();

			int days = 0;

			for (int j = y; j < 1000; j++) {
				if (j % 3 == 0) {
					days += 200;
				} else {
					days += 195;
				}
			}
			
			if(y%3==0){
				for(int j=1;j<m;j++){
					days -= 20;
				}
			}else{
				for(int j=1;j<m;j++){
					days -= 20;
					if(j%2==0)days += 1;
				}
			}
			days -= (d-1);
			System.out.println(days);
		}

		
		scan.close();
	}

}