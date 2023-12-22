import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int array[] = new int [N];
		int tmp1 = sc.nextInt();
		int count = 0;
		int check1 = 0;
		int check2 = 0;
		int last = 0;
		int first = 0;
		int flag = 0;
		//int check1 = new int[3];
		//int check2 = new int[3];
		for(int i = 0; i < N-1; i++) {
			int tmp2 = sc.nextInt();
			if(tmp1 > tmp2 ) {
				count++;
				if(flag == 0) {
					check1 = tmp2;
					first = tmp1;
					flag++;
				}
				check2 = tmp1;
				last = tmp2;
				if(count>=3) {
					break;
				}
			}
			tmp1 = tmp2;
		}

		if(count==1 || count>=3) {
			System.out.println("NO");
		}else if(check1<=last && count!=0) {
			System.out.println("NO");
		}else if(check2>=first && count!=0) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}



	}

}