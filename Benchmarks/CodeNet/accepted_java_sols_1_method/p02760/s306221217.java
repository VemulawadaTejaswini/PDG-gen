import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int array[][] = new int [3][3];

		boolean ans[][] = new boolean [3][3];




		for(int i = 0;i<3;i++){
			for(int j = 0;j<3;j++){
				array[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();

		for(int i = 0;i<n;i++){
			int tmp = sc.nextInt();
			for(int j = 0;j<3;j++){
				for(int k = 0;k<3;k++){
					if(array[j][k] == tmp){
						ans[j][k] = true;
					}
				}
			}
		}

		boolean a = false;
		for(int i = 0;i<3;i++){
			if((ans[i][0] && ans[i][1] && ans[i][2]) || (ans[0][i] && ans[1][i] && ans[2][i])){
				a= true;
				break;
			}
		}

		if(!a){
			if((ans[0][0] && ans[1][1] && ans[2][2]) || (ans[0][2] && ans[1][1] && ans[2][0])){
				a= true;
			}
		}

		if(a){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

	}