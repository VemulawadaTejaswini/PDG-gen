import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		String[] split = s.split("");
		Boolean isOK = false;
		String tmp = split[0];
		for(String ss: split){
			if(isOK) break;
			if(!tmp.equals(ss)){
				isOK = true;
			}
		}
		String result = isOK ? "Yes" : "No";
		System.out.println(result);
	}

}
