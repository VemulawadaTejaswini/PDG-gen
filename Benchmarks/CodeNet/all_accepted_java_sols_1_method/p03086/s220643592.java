import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String sample = scanner.nextLine();

		// A C G T
		int max = 0;
		int temp = 0;
		String[] s = sample.split("");

		for(String a : s){
			if(a.equals("A") || a.equals("G") || a.equals("C") || a.equals("T")){
				temp++;
				if(temp > max){
					max = temp;
				}
			}else{
				if(temp > max){
					max = temp;
				}
				temp = 0;
			}
		}
		System.out.println(max);
	}
}
