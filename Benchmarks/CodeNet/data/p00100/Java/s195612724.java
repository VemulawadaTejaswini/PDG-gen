import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, empnum, cnt;
		double[] emp = new double[4000];

		while((n = sc.nextInt()) != 0){
			cnt = 0;
			for(int i = 0; i < emp.length; i++) emp[i] = 0;

			for(int i = 0; i < n; i++){
				empnum = sc.nextInt();
				emp[empnum - 1] += sc.nextInt() * sc.nextInt();
			}

			for(int i = 0; i < emp.length; i++){
				if(emp[i] >= 1000000){
					System.out.println(i + 1);
					cnt++;
				}
			}
			if(cnt == 0) System.out.println("NA");
		}
	}
}