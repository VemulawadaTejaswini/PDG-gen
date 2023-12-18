import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, empnum, cnt, turnnum;
		int turn[] = new int[4001];
		double[] emp = new double[4001];
		boolean dup[] = new boolean[4001];

		while((n = sc.nextInt()) != 0){
			cnt = 0;
			for(int i = 0; i < emp.length; i++){
				turn[i] = 0;
				emp[i] = 0;
				dup[i] = false;
			}

			turnnum = 0;
			for(int i = 0; i < n; i++){
				empnum = sc.nextInt();
				if(dup[empnum] == false){
					turn[turnnum] = empnum;
					dup[empnum] = true;
					turnnum++;
				}
				emp[empnum] += sc.nextInt() * sc.nextInt();
			}

			for(int i = 0; i < n; i++){
				if(emp[turn[i]] >= 1000000){
					System.out.println(turn[i]);
					cnt++;
				}
			}
			if(cnt == 0) System.out.println("NA");
		}
	}
}