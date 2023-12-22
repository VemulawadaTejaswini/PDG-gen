import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		boolean flg = true;
		for(int i = 0; i < a.length(); i++){
			if(i%2==0){
				if(a.substring(i, i+1).equals("L")){
					flg = false;
				}
			}
			else{
				if(a.substring(i, i+1).equals("R")){
					flg = false;
				}
			}
		}
		if(flg){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}

	}

}