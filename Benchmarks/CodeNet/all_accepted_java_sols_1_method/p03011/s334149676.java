import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();

		int case_1 = P +Q;
		int case_2 = P +R;
		int case_3 = R +Q;;
		int case_4 = Q +R;
		//int min = 0;

		//if(min>case_1)min=case_1;
		if(case_1>case_2)case_1=case_2;
		if(case_1>case_3)case_1=case_3;
		if(case_1>case_4)case_1=case_4;

		System.out.println(case_1);
	}

}
