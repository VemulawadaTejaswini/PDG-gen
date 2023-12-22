import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int h[] = new int[a];
		for(int k = 0; k < a; k++){
			h[k] = sc.nextInt();
		}
		boolean flg1 = true;
		boolean flg2 = false;

		for(int i = 1; i < a; i++){
			if(h[i] - h[i-1] == -1 && flg2 == false){
				flg2 = true;
			}
			else if(h[i] - h[i-1] == -1 && flg2 == true){
				flg1 = false;
				break;
			}
			else if(h[i] - h[i-1] > 0){
				flg2 = false;
			}
			else if(h[i] - h[i-1] < -1){
				flg1 = false;
				break;
			}
		}

		if(flg1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}