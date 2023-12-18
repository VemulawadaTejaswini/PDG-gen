import java.util.Scanner;

public class Main {
	static StringBuilder text;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		text = new StringBuilder();
		scan.close();
		for(int i = 1;i <= n;i++){
			if(i % 3 == 0){
				text.append(" ").append(i);
			}else {
				if(process(i))
					text.append(" ").append(i);
			}
		}
		System.out.println(text.toString());
	}
	static boolean process(int i){
		if(i % 10 == 3){
			return true;
		}else{
			if(i / 10 == 0)
				return false;
			return process(i / 10);
		}
	}
}