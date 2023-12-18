import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sheet[][] = new int[3][3];
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				sheet[i][j] = sc.nextInt();

		int N = sc.nextInt();
		for(int n = 0; n < N; n++){
			int x = sc.nextInt();
			for(int i = 0; i < 3; i++)
				for(int j = 0; j < 3; j++)
					if(sheet[i][j] == x)sheet[i][j] = 0;
		}

		boolean flag;

		boolean f1 = false;
		boolean f2 = false;

		for(int i = 0; i < 3; i++){
			f1 = true;
			f2 = true;
			for(int j = 0; j < 3; j++){
				if(sheet[i][j] != 0)f1 = false;
				if(sheet[j][i] != 0)f2 = false;
			}
			if(f1 || f2)break;
		}
		
		flag = f1 || f2;
		
		if(!flag){
			f1 = true;
			f2 = true;
			for(int i = 0; i < 3; i++){
				if(sheet[i][i] != 0)f1 = false;
				if(sheet[i][2 - i] != 0)f2 = false;
			}
			flag = flag || f1 || f2;
		}


		System.out.println((flag)?"Yes":"No");
	}
}